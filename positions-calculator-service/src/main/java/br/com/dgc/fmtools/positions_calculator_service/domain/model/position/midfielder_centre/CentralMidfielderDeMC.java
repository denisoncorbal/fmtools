package br.com.dgc.fmtools.positions_calculator_service.domain.model.position.midfielder_centre;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.Position;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.PositionNames;
import java.util.List;

public class CentralMidfielderDeMC extends Position {

  public CentralMidfielderDeMC(LinePlayer player) {
    super(
        PositionNames.CENTRAL_MIDFIELDER_DE_MC_NAME,
        List.of(
            player.getFirstTouch() * MidfielderCentreWeights.FIRST_TOUCH,
            player.getMarking() * MidfielderCentreWeights.MARKING,
            player.getPassing() * MidfielderCentreWeights.PASSING,
            player.getTechnique() * MidfielderCentreWeights.TECHNIQUE,
            player.getAggression() * MidfielderCentreWeights.AGGRESSION,
            player.getAnticipation() * MidfielderCentreWeights.ANTICIPATION,
            player.getComposure() * MidfielderCentreWeights.COMPOSURE,
            player.getWorkRate() * MidfielderCentreWeights.WORK_RATE,
            player.getStamina() * MidfielderCentreWeights.STAMINA),
        List.of(
            player.getTackling() * MidfielderCentreWeights.TACKLING * 2,
            player.getConcentration() * MidfielderCentreWeights.CONCENTRATION * 2,
            player.getDecisions() * MidfielderCentreWeights.DECISIONS * 2,
            player.getPositioning() * MidfielderCentreWeights.POSITIONING * 2,
            player.getTeamwork() * MidfielderCentreWeights.TEAMWORK * 2),
        List.of(
                MidfielderCentreWeights.FIRST_TOUCH,
                MidfielderCentreWeights.MARKING,
                MidfielderCentreWeights.PASSING,
                MidfielderCentreWeights.TECHNIQUE,
                MidfielderCentreWeights.AGGRESSION,
                MidfielderCentreWeights.ANTICIPATION,
                MidfielderCentreWeights.COMPOSURE,
                MidfielderCentreWeights.WORK_RATE,
                MidfielderCentreWeights.STAMINA,
                MidfielderCentreWeights.TACKLING * 2,
                MidfielderCentreWeights.CONCENTRATION * 2,
                MidfielderCentreWeights.DECISIONS * 2,
                MidfielderCentreWeights.POSITIONING * 2,
                MidfielderCentreWeights.TEAMWORK * 2)
            .stream()
            .reduce(0, Integer::sum));
  }
}
