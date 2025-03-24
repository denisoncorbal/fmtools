package br.com.dgc.fmtools.formation_calculator_service.domain.model.tactical_styles;

import br.com.dgc.fmtools.formation_calculator_service.domain.model.TacticalStyle;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.formations.FiveThreeTwoDmWbFormation;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.formations.FourFourTwoFormation;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.formations.FourThreeThreeDmWideFormation;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.attacking_midfielder_right_left.WingerAtAMRL;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.attacking_midfielder_right_left.WingerSuAMRL;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.defender_centre.CentralDefenderCoDC;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.defender_centre.NoNonsenseCentreBackDeDC;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.defender_centre.WideCentreBackDeDC;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.defender_right_left.FullBackAuDRL;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.defender_right_left.FullBackSuDRL;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.defender_right_left.NoNonsenseFullBackDeDRL;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.defensive_midfielder.AnchorDeDM;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.defensive_midfielder.DefensiveMidfielderDeDM;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.goalkeeper.GoalkeeperDeGK;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.midfielder_centre.BallWinningMidfielderDeMC;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.midfielder_centre.BoxToBoxMidfielderSuMC;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.midfielder_centre.CentralMidfielderAtMC;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.midfielder_centre.CentralMidfielderSuMC;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.midfielder_right_left.WingerAtMRL;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.midfielder_right_left.WingerSuMRL;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.striker_centre.PoacherAtSC;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.striker_centre.PressingForwardAtSC;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.striker_centre.TargetForwardAtSC;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.striker_centre.TargetForwardSuSC;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.wing_back_right_left.WingBackSuWBRL;
import java.util.List;

public class RouteOneTacticalStyle extends TacticalStyle {

  public RouteOneTacticalStyle() {
    super(
        "Route One",
        "balanced",
        List.of(
            new FourFourTwoFormation(
                List.of(
                    new FullBackAuDRL(),
                    new NoNonsenseCentreBackDeDC(),
                    new NoNonsenseCentreBackDeDC(),
                    new FullBackSuDRL(),
                    new WingerSuMRL(),
                    new BoxToBoxMidfielderSuMC(),
                    new BallWinningMidfielderDeMC(),
                    new WingerAtMRL(),
                    new PressingForwardAtSC(),
                    new TargetForwardAtSC()),
                new GoalkeeperDeGK()),
            new FourThreeThreeDmWideFormation(
                List.of(
                    new NoNonsenseFullBackDeDRL(),
                    new NoNonsenseCentreBackDeDC(),
                    new NoNonsenseCentreBackDeDC(),
                    new FullBackSuDRL(),
                    new AnchorDeDM(),
                    new BoxToBoxMidfielderSuMC(),
                    new CentralMidfielderSuMC(),
                    new WingerSuAMRL(),
                    new WingerAtAMRL(),
                    new TargetForwardAtSC()),
                new GoalkeeperDeGK()),
            new FiveThreeTwoDmWbFormation(
                List.of(
                    new NoNonsenseCentreBackDeDC(),
                    new CentralDefenderCoDC(),
                    new WideCentreBackDeDC(),
                    new WingBackSuWBRL(),
                    new WingBackSuWBRL(),
                    new DefensiveMidfielderDeDM(),
                    new BoxToBoxMidfielderSuMC(),
                    new CentralMidfielderAtMC(),
                    new PoacherAtSC(),
                    new TargetForwardSuSC()),
                new GoalkeeperDeGK())));
  }
}
