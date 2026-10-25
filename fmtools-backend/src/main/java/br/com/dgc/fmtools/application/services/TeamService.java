package br.com.dgc.fmtools.application.services;

import java.util.List;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationToken;
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
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication instanceof JwtAuthenticationToken jwtAuth) {
            te.setOwnerId(jwtAuth.getToken().getSubject());
            te = this.teamRepositoryPort.saveToDatabase(te);
            return this.teamMapper.toTeamResponseDto(te);
        }
        return null;
    }

    public List<GetAllTeamsResponseDto> getAllTeams() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication instanceof JwtAuthenticationToken jwtAuth) {
            String ownerId = jwtAuth.getToken().getSubject();
            List<TeamEntity> teList = this.teamRepositoryPort.getAllTeamsFromDatabase(ownerId);
            return teList.stream().map(this.teamMapper::toGetAllTeamsResponseDto).toList();
        }
        return null;
    }

}
