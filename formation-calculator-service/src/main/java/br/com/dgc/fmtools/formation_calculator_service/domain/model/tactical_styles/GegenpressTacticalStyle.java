package br.com.dgc.fmtools.formation_calculator_service.domain.model.tactical_styles;

import br.com.dgc.fmtools.formation_calculator_service.domain.model.TacticalStyle;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.formations.FourThreeThreeDmWideFormation;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.formations.FourTwoFourDmWideFormation;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.formations.FourTwoThreeOneDmAmWideFormation;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.attacking_midfielder_centre.AttackingMidfielderAtAMC;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.attacking_midfielder_right_left.InsideForwardAtAMRL;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.attacking_midfielder_right_left.InsideForwardSuAMRL;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.defender_centre.BallPlayingDefenderDeDC;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.defender_centre.CentralDefenderDeDC;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.defender_right_left.WingBackAtDRL;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.defender_right_left.WingBackSuDRL;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.defensive_midfielder.BallWinningMidfielderDeDM;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.defensive_midfielder.DeepLyingPlaymakerDeDM;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.defensive_midfielder.RoamingPlaymakerSuDM;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.goalkeeper.SweeperKeeperAtGK;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.midfielder_centre.BoxToBoxMidfielderSuMC;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.midfielder_centre.CarrileroSuMC;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.striker_centre.AdvancedForwardAtSC;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.striker_centre.PressingForwardAtSC;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.striker_centre.PressingForwardSuSC;
import java.util.List;

public class GegenpressTacticalStyle extends TacticalStyle {

  public GegenpressTacticalStyle() {
    super(
        "Gegenpress",
        "positive",
        List.of(
            new FourThreeThreeDmWideFormation(
                List.of(
                    new WingBackSuDRL(),
                    new WingBackSuDRL(),
                    new BallPlayingDefenderDeDC(),
                    new BallPlayingDefenderDeDC(),
                    new DeepLyingPlaymakerDeDM(),
                    new BoxToBoxMidfielderSuMC(),
                    new CarrileroSuMC(),
                    new InsideForwardAtAMRL(),
                    new InsideForwardAtAMRL(),
                    new PressingForwardAtSC()),
                new SweeperKeeperAtGK()),
            new FourTwoThreeOneDmAmWideFormation(
                List.of(
                    new WingBackSuDRL(),
                    new WingBackAtDRL(),
                    new CentralDefenderDeDC(),
                    new BallPlayingDefenderDeDC(),
                    new RoamingPlaymakerSuDM(),
                    new BallWinningMidfielderDeDM(),
                    new InsideForwardAtAMRL(),
                    new InsideForwardSuAMRL(),
                    new AttackingMidfielderAtAMC(),
                    new PressingForwardAtSC()),
                new SweeperKeeperAtGK()),
            new FourTwoFourDmWideFormation(
                List.of(
                    new WingBackSuDRL(),
                    new WingBackSuDRL(),
                    new BallPlayingDefenderDeDC(),
                    new CentralDefenderDeDC(),
                    new RoamingPlaymakerSuDM(),
                    new BallWinningMidfielderDeDM(),
                    new InsideForwardAtAMRL(),
                    new InsideForwardAtAMRL(),
                    new AdvancedForwardAtSC(),
                    new PressingForwardSuSC()),
                new SweeperKeeperAtGK())));
  }
}
