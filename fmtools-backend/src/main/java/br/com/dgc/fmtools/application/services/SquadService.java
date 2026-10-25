package br.com.dgc.fmtools.application.services;

import java.util.List;
import java.util.UUID;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationToken;
import org.springframework.stereotype.Service;

import br.com.dgc.fmtools.application.ports.outbound.SquadRepositoryPort;
import br.com.dgc.fmtools.application.ports.outbound.TeamRepositoryPort;
import br.com.dgc.fmtools.application.services.mappers.SquadMapper;
import br.com.dgc.fmtools.infrastructure.adapters.inbound.rest.dtos.request.SquadRequestDto;
import br.com.dgc.fmtools.infrastructure.adapters.inbound.rest.dtos.response.GetAllSquadsResponseDto;
import br.com.dgc.fmtools.infrastructure.adapters.inbound.rest.dtos.response.SquadResponseDto;
import br.com.dgc.fmtools.infrastructure.adapters.outbound.persistence.entities.SquadEntity;
import br.com.dgc.fmtools.infrastructure.adapters.outbound.persistence.entities.TeamEntity;

@Service
public class SquadService {
    private final SquadMapper squadMapper;
    private final SquadRepositoryPort squadRepositoryPort;
    private final TeamRepositoryPort teamRepositoryPort;

    public SquadService(SquadMapper squadMapper, SquadRepositoryPort squadRepositoryPort,
            TeamRepositoryPort teamRepositoryPort) {
        this.squadMapper = squadMapper;
        this.squadRepositoryPort = squadRepositoryPort;
        this.teamRepositoryPort = teamRepositoryPort;
    }

    public SquadResponseDto createSquad(SquadRequestDto squadRequestDto) {
        SquadEntity se = this.squadMapper.toSquadEntity(squadRequestDto);
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication instanceof JwtAuthenticationToken jwtAuth) {
            String ownerId = jwtAuth.getToken().getSubject();
            se.setOwnerId(ownerId);
            TeamEntity te = this.teamRepositoryPort.getFromDatabase(squadRequestDto.teamId());
            if (!te.getOwnerId().equals(ownerId))
                return null;
            se.setTeam(te);
            se = this.squadRepositoryPort.saveToDatabase(se);
            return this.squadMapper.toSquadResponseDto(se);
        }
        return null;
    }

    public List<GetAllSquadsResponseDto> getAllSquadsByTeamId(UUID teamId) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication instanceof JwtAuthenticationToken jwtAuth) {
            String ownerId = jwtAuth.getToken().getSubject();
            List<SquadEntity> seList = this.squadRepositoryPort.getAllSquadsFromDatabaseByTeamIdAndOwnerId(teamId,
                    ownerId);
            return seList.stream().map(this.squadMapper::toGetAllSquadsResponseDto).toList();
        }
        return null;
    }

    public Object getAllSquads() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication instanceof JwtAuthenticationToken jwtAuth) {
            String ownerId = jwtAuth.getToken().getSubject();
            List<SquadEntity> seList = this.squadRepositoryPort.getAllSquadsFromDatabaseByOwnerId(ownerId);
            return seList.stream().map(this.squadMapper::toGetAllSquadsResponseDto).toList();
        }
        return null;
    }
}
