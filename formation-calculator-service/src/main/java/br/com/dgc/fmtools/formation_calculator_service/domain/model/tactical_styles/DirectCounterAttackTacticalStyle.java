package br.com.dgc.fmtools.formation_calculator_service.domain.model.tactical_styles;

import br.com.dgc.fmtools.formation_calculator_service.domain.model.TacticalStyle;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.formations.FiveTwoThreeDmWideFormation;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.formations.FourFourTwoFormation;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.formations.FourThreeThreeDmWideFormation;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.attacking_midfielder_right_left.InsideForwardAtAMRL;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.attacking_midfielder_right_left.InsideForwardSuAMRL;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.attacking_midfielder_right_left.InvertedWingerSuAMRL;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.attacking_midfielder_right_left.WingerSuAMRL;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.defender_centre.CentralDefenderCoDC;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.defender_centre.CentralDefenderDeDC;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.defender_centre.NoNonsenseCentreBackDeDC;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.defender_right_left.FullBackAuDRL;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.defender_right_left.WingBackAuDRL;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.defensive_midfielder.AnchorDeDM;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.defensive_midfielder.DeepLyingPlaymakerSuDM;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.defensive_midfielder.DefensiveMidfielderDeDM;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.goalkeeper.GoalkeeperDeGK;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.goalkeeper.SweeperKeeperDeGK;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.midfielder_centre.BallWinningMidfielderDeMC;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.midfielder_centre.BoxToBoxMidfielderSuMC;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.midfielder_centre.CentralMidfielderDeMC;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.midfielder_centre.CentralMidfielderSuMC;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.midfielder_right_left.WideMidfielderSuMRL;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.midfielder_right_left.WingerSuMRL;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.striker_centre.AdvancedForwardAtSC;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.striker_centre.DeepLyingForwardAtSC;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.striker_centre.PressingForwardDeSC;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.wing_back_right_left.WingBackSuWBRL;
import java.util.List;

public class DirectCounterAttackTacticalStyle extends TacticalStyle {

  public DirectCounterAttackTacticalStyle() {
    super(
        "Direct Counter-Attack",
        "cautious",
        List.of(
            new FourFourTwoFormation(
                List.of(
                    new FullBackAuDRL(),
                    new FullBackAuDRL(),
                    new NoNonsenseCentreBackDeDC(),
                    new CentralDefenderDeDC(),
                    new WideMidfielderSuMRL(),
                    new CentralMidfielderSuMC(),
                    new BallWinningMidfielderDeMC(),
                    new WingerSuMRL(),
                    new AdvancedForwardAtSC(),
                    new PressingForwardDeSC()),
                new SweeperKeeperDeGK()),
            new FourThreeThreeDmWideFormation(
                List.of(
                    new WingBackAuDRL(),
                    new NoNonsenseCentreBackDeDC(),
                    new CentralDefenderDeDC(),
                    new FullBackAuDRL(),
                    new AnchorDeDM(),
                    new BoxToBoxMidfielderSuMC(),
                    new CentralMidfielderDeMC(),
                    new InsideForwardSuAMRL(),
                    new WingerSuAMRL(),
                    new AdvancedForwardAtSC()),
                new SweeperKeeperDeGK()),
            new FiveTwoThreeDmWideFormation(
                List.of(
                    new CentralDefenderDeDC(),
                    new CentralDefenderDeDC(),
                    new CentralDefenderCoDC(),
                    new WingBackSuWBRL(),
                    new WingBackSuWBRL(),
                    new DeepLyingPlaymakerSuDM(),
                    new DefensiveMidfielderDeDM(),
                    new InsideForwardAtAMRL(),
                    new InvertedWingerSuAMRL(),
                    new DeepLyingForwardAtSC()),
                new GoalkeeperDeGK())));
  }
}
