package br.com.dgc.fmtools.application.services.mappers;

import org.springframework.stereotype.Component;

import br.com.dgc.fmtools.infrastructure.adapters.inbound.rest.dtos.request.TeamRequestDto;
import br.com.dgc.fmtools.infrastructure.adapters.inbound.rest.dtos.response.GetAllTeamsResponseDto;
import br.com.dgc.fmtools.infrastructure.adapters.inbound.rest.dtos.response.TeamResponseDto;
import br.com.dgc.fmtools.infrastructure.adapters.outbound.persistence.entities.TeamEntity;

@Component
public class TeamMapper {
    public TeamEntity toTeamEntity(TeamRequestDto teamRequestDto) {
        return new TeamEntity(teamRequestDto.name());
    }

    public TeamResponseDto toTeamResponseDto(TeamEntity teamEntity) {
        return new TeamResponseDto(teamEntity.getId(), teamEntity.getName());
    }

    public GetAllTeamsResponseDto toGetAllTeamsResponseDto(TeamEntity teamEntity) {
        return new GetAllTeamsResponseDto(teamEntity.getId(), teamEntity.getName());
    }
}
