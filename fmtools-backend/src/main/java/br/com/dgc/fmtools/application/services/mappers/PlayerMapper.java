package br.com.dgc.fmtools.application.services.mappers;

import java.util.Map;

import org.springframework.stereotype.Component;

import br.com.dgc.fmtools.domain.model.Player;
import br.com.dgc.fmtools.infrastructure.adapters.inbound.rest.dtos.request.PlayerRequestDto;
import br.com.dgc.fmtools.infrastructure.adapters.inbound.rest.dtos.response.GetAllPlayersResponseDto;
import br.com.dgc.fmtools.infrastructure.adapters.inbound.rest.dtos.response.PlayerResponseDto;
import br.com.dgc.fmtools.infrastructure.adapters.outbound.persistence.entities.PlayerEntity;
import tools.jackson.core.type.TypeReference;
import tools.jackson.databind.ObjectMapper;

@Component
public class PlayerMapper {

    private final ObjectMapper objectMapper = new ObjectMapper();

    public Player toPlayer(PlayerEntity playerEntity) {
        return new Player(playerEntity.getId(), playerEntity.getName(),
                objectMapper.readValue(playerEntity.getAttributes(), new TypeReference<Map<String, Integer>>() {
                }));
    }

    public PlayerEntity toPlayerEntity(PlayerRequestDto playerRequestDto) {
        return new PlayerEntity(playerRequestDto.name(),
                objectMapper.writeValueAsString(playerRequestDto.attributes()));
    }

    public PlayerResponseDto toPlayerResponseDto(PlayerEntity playerEntity) {
        return new PlayerResponseDto(playerEntity.getId(), playerEntity.getName(),
                this.objectMapper.readValue(playerEntity.getAttributes(), new TypeReference<Map<String, Integer>>() {
                }));
    }

    public GetAllPlayersResponseDto toGetAllPlayersResponseDto(PlayerEntity playerEntity) {
        return new GetAllPlayersResponseDto(playerEntity.getId(), playerEntity.getName(),
                this.objectMapper.readValue(playerEntity.getAttributes(), new TypeReference<Map<String, Integer>>() {
                }));
    }
}
