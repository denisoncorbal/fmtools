package br.com.dgc.fmtools.formation_calculator_service.web.dto.request;

import java.util.List;
import java.util.UUID;

public record CalculateFormationRequest(
    List<UUID> linePlayersIds, List<UUID> goalkeeperPlayersIds) {}
