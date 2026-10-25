package br.com.dgc.fmtools.application.services;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Stream;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import br.com.dgc.fmtools.application.ports.outbound.PlayerRepositoryPort;
import br.com.dgc.fmtools.application.ports.outbound.SquadRepositoryPort;
import br.com.dgc.fmtools.application.services.mappers.PlayerMapper;
import br.com.dgc.fmtools.domain.model.constants.GoalkeepingAttributes;
import br.com.dgc.fmtools.domain.model.constants.MentalAttributes;
import br.com.dgc.fmtools.domain.model.constants.PhysicalAttributes;
import br.com.dgc.fmtools.domain.model.constants.TechnicalAttributes;
import br.com.dgc.fmtools.infrastructure.adapters.inbound.rest.dtos.request.PlayerRequestDto;
import br.com.dgc.fmtools.infrastructure.adapters.inbound.rest.dtos.response.GetAllPlayersResponseDto;
import br.com.dgc.fmtools.infrastructure.adapters.inbound.rest.dtos.response.PlayerResponseDto;
import br.com.dgc.fmtools.infrastructure.adapters.outbound.persistence.entities.PlayerEntity;
import br.com.dgc.fmtools.infrastructure.adapters.outbound.persistence.entities.SquadEntity;

@Service
public class PlayerService {
    private final PlayerMapper playerMapper;
    private final PlayerRepositoryPort playerRepositoryPort;
    private final SquadRepositoryPort squadRepositoryPort;

    private static final String REGEX_FIND_SPACES_BETWEEN_WORDS = "\\b\\s+";

    private static final String REGEX_FIND_SPACES = "\\s";

    private static final String REGEX_FIND_VERTICAL_LINE_OR_HIFEN_OR_SPACE = "(\\|)|(-)|(\\s)";

    private static final String REGEX_FIND_WORDS_SNAKE_CASE = "[A-Za-z_]+";

    private static final String REGEX_FIND_NUMBERS = "[0-9]+";

    private static final String TABLE_DATA_SELECTOR = "td";

    private static final String UNDERSCORE = "_";

    private static final String NEWLINE = "\n";

    public PlayerService(PlayerMapper playerMapper, PlayerRepositoryPort playerRepositoryPort,
            SquadRepositoryPort squadRepositoryPort) {
        this.playerMapper = playerMapper;
        this.playerRepositoryPort = playerRepositoryPort;
        this.squadRepositoryPort = squadRepositoryPort;
    }

    public PlayerResponseDto createPlayer(PlayerRequestDto playerRequestDto) {
        PlayerEntity pe = this.playerMapper.toPlayerEntity(playerRequestDto);
        UserDetails user = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        UUID ownerId = UUID.fromString(user.getUsername());
        pe.setOwnerId(ownerId);
        SquadEntity se = this.squadRepositoryPort.getFromDatabase(playerRequestDto.squadId());
        if (!se.getOwnerId().equals(ownerId)) {
            return null;
        }
        pe.setSquad(se);
        pe = this.playerRepositoryPort.saveToDatabase(pe);
        return this.playerMapper.toPlayerResponseDto(pe);
    }

    public PlayerResponseDto createPlayerFromText(String name, MultipartFile file, UUID squadId) throws IOException {
        List<String> keys = new ArrayList<>();
        List<Integer> values = new ArrayList<>();

        Stream<String> lines = file.getResource().getContentAsString(StandardCharsets.US_ASCII)
                .replaceAll(PlayerService.REGEX_FIND_SPACES_BETWEEN_WORDS, PlayerService.UNDERSCORE)
                .replaceAll(PlayerService.REGEX_FIND_VERTICAL_LINE_OR_HIFEN_OR_SPACE, PlayerService.NEWLINE).lines();

        lines.forEach((line) -> {
            String trimmedLine = line.trim();
            if (trimmedLine.length() > 0) {
                String finalLine = trimmedLine.substring(0, trimmedLine.length() - 1);
                if (finalLine.matches(PlayerService.REGEX_FIND_WORDS_SNAKE_CASE)) {
                    keys.add(finalLine.toUpperCase());
                }
                if (finalLine.matches(PlayerService.REGEX_FIND_NUMBERS)) {
                    values.add(Integer.parseInt(finalLine));
                }
            }
        });

        Map<String, Integer> result = new HashMap<>();

        List<String> finalKeys = keys.stream()
                .filter((k) -> Arrays.stream(GoalkeepingAttributes.values()).anyMatch(ga -> ga.name().equals(k)) ||
                        Arrays.stream(MentalAttributes.values()).anyMatch(ma -> ma.name().equals(k)) ||
                        Arrays.stream(TechnicalAttributes.values()).anyMatch(ta -> ta.name().equals(k)) ||
                        Arrays.stream(PhysicalAttributes.values()).anyMatch(pa -> pa.name().equals(k)))
                .toList();

        for (int i = 0; i < finalKeys.size(); i++) {
            result.put(finalKeys.get(i), values.get(i));
        }

        return createPlayer(new PlayerRequestDto(name, result, squadId));
    }

    public PlayerResponseDto createPlayerFromHtml(String name, MultipartFile file, UUID squadId) throws IOException {
        List<String> keys = new ArrayList<>();
        List<Integer> values = new ArrayList<>();

        Document doc = Jsoup.parse(file.getResource().getContentAsString(StandardCharsets.US_ASCII));

        Elements tdElements = doc.select(PlayerService.TABLE_DATA_SELECTOR);

        List<String> tdTexts = tdElements.stream()
                .map((e) -> {
                    if (e != null) {
                        return e.text();
                    }
                    return "";
                })
                .toList();

        tdTexts.forEach(
                tt -> {
                    if (tt.matches(PlayerService.REGEX_FIND_NUMBERS)) {
                        values.add(Integer.parseInt(tt));
                    } else {
                        keys.add(tt.trim().replaceAll(PlayerService.REGEX_FIND_SPACES, PlayerService.UNDERSCORE)
                                .toUpperCase());
                    }
                });

        Map<String, Integer> result = new HashMap<>();

        List<String> finalKeys = keys.stream()
                .filter((k) -> Arrays.stream(GoalkeepingAttributes.values()).anyMatch(ga -> ga.name().equals(k)) ||
                        Arrays.stream(MentalAttributes.values()).anyMatch(ma -> ma.name().equals(k)) ||
                        Arrays.stream(TechnicalAttributes.values()).anyMatch(ta -> ta.name().equals(k)) ||
                        Arrays.stream(PhysicalAttributes.values()).anyMatch(pa -> pa.name().equals(k)))
                .toList();

        for (int i = 0; i < finalKeys.size(); i++) {
            result.put(finalKeys.get(i), values.get(i));
        }

        return createPlayer(new PlayerRequestDto(name, result, squadId));
    }

    public List<GetAllPlayersResponseDto> getAllPlayers(UUID squadId) {
        UserDetails user = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        UUID ownerId = UUID.fromString(user.getUsername());
        List<PlayerEntity> peList = this.playerRepositoryPort.getPlayersBySquadIdAndOwnerId(squadId, ownerId);
        return peList.stream().map(t -> {
            return this.playerMapper.toGetAllPlayersResponseDto(t);
        }).toList();
    }

    public GetAllPlayersResponseDto getPlayerById(UUID id) {
        UserDetails user = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        UUID ownerId = UUID.fromString(user.getUsername());
        PlayerEntity pe = this.playerRepositoryPort.getPlayerFromDatabase(id, ownerId);
        return this.playerMapper.toGetAllPlayersResponseDto(pe);
    }
}
