package br.com.dgc.fmtools.formation_calculator_service.domain.service;

import br.com.dgc.fmtools.formation_calculator_service.clients.GoalkeeperPlayerExternal;
import br.com.dgc.fmtools.formation_calculator_service.clients.LinePlayerExternal;
import br.com.dgc.fmtools.formation_calculator_service.clients.PositionExternal;
import br.com.dgc.fmtools.formation_calculator_service.clients.PositionsCalculatorClientService;
import br.com.dgc.fmtools.formation_calculator_service.clients.SquadManagerClientService;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.Position;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.TacticalStyle;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.GenericPosition;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.tactical_styles.CatenaccioTacticalStyle;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.tactical_styles.ControlPossessionTacticalStyle;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.tactical_styles.DirectCounterAttackTacticalStyle;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.tactical_styles.FluidCounterAttackTacticalSyle;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.tactical_styles.GegenpressTacticalStyle;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.tactical_styles.ParkTheBusTacticalStyle;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.tactical_styles.RouteOneTacticalStyle;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.tactical_styles.TikiTakaTacticalStyle;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.tactical_styles.VerticalTikiTakaTacticalStyle;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.tactical_styles.WingPlayTacticalStyle;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class FormationCalculatorService {
  private final Logger log = LoggerFactory.getLogger(FormationCalculatorService.class);

  private PositionsCalculatorClientService positionsCalculatorClientService;
  private SquadManagerClientService squadManagerClientService;

  public FormationCalculatorService(
      PositionsCalculatorClientService positionsCalculatorClientService,
      SquadManagerClientService squadManagerClientService) {
    this.positionsCalculatorClientService = positionsCalculatorClientService;
    this.squadManagerClientService = squadManagerClientService;
  }

  public List<TacticalStyle> calculateFormation(
      List<UUID> linePlayersIds, List<UUID> goalkeeperPlayersIds) {
    log.info("Begin to Calculate Formation");

    List<Position> linePositions = new ArrayList<Position>();
    log.info("Generating list with all line positions");
    linePlayersIds.forEach(
        (id) -> {
          LinePlayerExternal externalLinePlayer =
              this.squadManagerClientService.getLinePlayerById(id).get();
          List<PositionExternal> externalPositions =
              this.positionsCalculatorClientService.getLinePositionsById(id).get();
          externalPositions.forEach(
              (position) -> {
                linePositions.add(
                    new GenericPosition(
                        position.name(), id, externalLinePlayer.name(), position.percentage()));
              });
        });
    List<Position> goalkeeperPositions = new ArrayList<Position>();
    log.info("Generating all goalkeeper positions");
    goalkeeperPlayersIds.forEach(
        (id) -> {
          GoalkeeperPlayerExternal externalLinePlayer =
              this.squadManagerClientService.getGoalkeeperPlayerById(id).get();
          List<PositionExternal> externalPositions =
              this.positionsCalculatorClientService.getGoalkeeperPositionsById(id).get();
          externalPositions.forEach(
              (position) -> {
                goalkeeperPositions.add(
                    new GenericPosition(
                        position.name(), id, externalLinePlayer.name(), position.percentage()));
              });
        });
    log.info("Generating tactical style list");
    List<TacticalStyle> tacticalStylesList =
        List.of(
            new ControlPossessionTacticalStyle(),
            new GegenpressTacticalStyle(),
            new TikiTakaTacticalStyle(),
            new VerticalTikiTakaTacticalStyle(),
            new WingPlayTacticalStyle(),
            new RouteOneTacticalStyle(),
            new FluidCounterAttackTacticalSyle(),
            new DirectCounterAttackTacticalStyle(),
            new CatenaccioTacticalStyle(),
            new ParkTheBusTacticalStyle());
    log.info("Calculating formation for tactical styles");
    tacticalStylesList.forEach(
        (tacticalStyle) -> tacticalStyle.calculateFormations(linePositions, goalkeeperPositions));

    log.info("Finished calculating formation for tactical styles");

    return tacticalStylesList;
  }
}
