package br.com.dgc.fmtools.application.services.mappers;

import java.util.Map;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.dgc.fmtools.domain.model.Player;
import br.com.dgc.fmtools.infrastructure.adapters.inbound.rest.dtos.request.PlayerRequestDto;
import br.com.dgc.fmtools.infrastructure.adapters.inbound.rest.dtos.response.GetAllPlayersResponseDto;
import br.com.dgc.fmtools.infrastructure.adapters.inbound.rest.dtos.response.PlayerResponseDto;
import br.com.dgc.fmtools.infrastructure.adapters.outbound.persistence.entities.PlayerEntity;

@Component
public class PlayerMapper {

    private final ObjectMapper objectMapper = new ObjectMapper();

    public Player toPlayer(PlayerEntity playerEntity) throws JsonMappingException, JsonProcessingException {
        return new Player(playerEntity.getId(), playerEntity.getName(),
                objectMapper.readValue(playerEntity.getAttributes(), new TypeReference<Map<String, Integer>>() {
                }));
    }

    public PlayerEntity toPlayerEntity(PlayerRequestDto playerRequestDto) {
        try {
            return new PlayerEntity(playerRequestDto.name(),
                    objectMapper.writeValueAsString(playerRequestDto.attributes()));
        } catch (JsonProcessingException e) {
            return null;
        }
    }

    public PlayerResponseDto toPlayerResponseDto(PlayerEntity playerEntity)
            throws JsonMappingException, JsonProcessingException {
        return new PlayerResponseDto(playerEntity.getId(), playerEntity.getName(),
                this.objectMapper.readValue(playerEntity.getAttributes(), new TypeReference<Map<String, Integer>>() {
                }));
    }

    public GetAllPlayersResponseDto toGetAllPlayersResponseDto(PlayerEntity playerEntity)
            throws JsonMappingException, JsonProcessingException {
        return new GetAllPlayersResponseDto(playerEntity.getId(), playerEntity.getName(),
                this.objectMapper.readValue(playerEntity.getAttributes(), new TypeReference<Map<String, Integer>>() {
                }));
    }
}
