package br.com.dgc.fmtools.application.services;

import java.util.List;
import java.util.UUID;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import br.com.dgc.fmtools.application.ports.outbound.TeamRepositoryPort;
import br.com.dgc.fmtools.application.services.mappers.TeamMapper;
import br.com.dgc.fmtools.infrastructure.adapters.inbound.rest.dtos.request.TeamRequestDto;
import br.com.dgc.fmtools.infrastructure.adapters.inbound.rest.dtos.response.GetAllTeamsResponseDto;
import br.com.dgc.fmtools.infrastructure.adapters.inbound.rest.dtos.response.TeamResponseDto;
import br.com.dgc.fmtools.infrastructure.adapters.outbound.persistence.entities.TeamEntity;

@Service
public class TeamService {

    private final TeamMapper teamMapper;
    private final TeamRepositoryPort teamRepositoryPort;

    public TeamService(TeamMapper teamMapper, TeamRepositoryPort teamRepositoryPort) {
        this.teamMapper = teamMapper;
        this.teamRepositoryPort = teamRepositoryPort;
    }

    public TeamResponseDto createTeam(TeamRequestDto teamRequestDto) {
        TeamEntity te = this.teamMapper.toTeamEntity(teamRequestDto);
        UserDetails user = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        te.setOwnerId(UUID.fromString(user.getUsername()));
        te = this.teamRepositoryPort.saveToDatabase(te);
        return this.teamMapper.toTeamResponseDto(te);
    }

    public List<GetAllTeamsResponseDto> getAllTeams() {
        UserDetails user = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        UUID ownerId = UUID.fromString(user.getUsername());
        List<TeamEntity> teList = this.teamRepositoryPort.getAllTeamsFromDatabase(ownerId);
        return teList.stream().map(this.teamMapper::toGetAllTeamsResponseDto).toList();
    }

}
