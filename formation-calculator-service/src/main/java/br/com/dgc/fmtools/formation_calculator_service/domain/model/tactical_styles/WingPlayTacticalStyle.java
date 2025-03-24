package br.com.dgc.fmtools.formation_calculator_service.domain.model.tactical_styles;

import br.com.dgc.fmtools.formation_calculator_service.domain.model.TacticalStyle;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.formations.FiveTwoThreeDmWideFormation;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.formations.FourFourTwoFormation;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.formations.FourThreeThreeDmWideFormation;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.attacking_midfielder_right_left.WingerAtAMRL;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.attacking_midfielder_right_left.WingerSuAMRL;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.defender_centre.BallPlayingDefenderDeDC;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.defender_centre.CentralDefenderCoDC;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.defender_centre.CentralDefenderDeDC;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.defender_centre.WideCentreBackAtDC;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.defender_right_left.WingBackAtDRL;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.defender_right_left.WingBackSuDRL;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.defensive_midfielder.AnchorDeDM;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.defensive_midfielder.DeepLyingPlaymakerSuDM;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.defensive_midfielder.DefensiveMidfielderDeDM;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.goalkeeper.GoalkeeperDeGK;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.midfielder_centre.BallWinningMidfielderDeMC;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.midfielder_centre.BoxToBoxMidfielderSuMC;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.midfielder_centre.DeepLyingPlaymakerSuMC;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.midfielder_right_left.WingerAtMRL;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.midfielder_right_left.WingerSuMRL;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.striker_centre.AdvancedForwardAtSC;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.striker_centre.DeepLyingForwardSuSC;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.striker_centre.TargetForwardAtSC;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.wing_back_right_left.WingBackAtWBRL;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.wing_back_right_left.WingBackSuWBRL;
import java.util.List;

public class WingPlayTacticalStyle extends TacticalStyle {

  public WingPlayTacticalStyle() {
    super(
        "Wing Play Tactical Style",
        "balanced",
        List.of(
            new FourFourTwoFormation(
                List.of(
                    new WingBackAtDRL(),
                    new CentralDefenderDeDC(),
                    new CentralDefenderDeDC(),
                    new WingBackSuDRL(),
                    new WingerSuMRL(),
                    new BoxToBoxMidfielderSuMC(),
                    new BallWinningMidfielderDeMC(),
                    new WingerAtMRL(),
                    new AdvancedForwardAtSC(),
                    new DeepLyingForwardSuSC()),
                new GoalkeeperDeGK()),
            new FourThreeThreeDmWideFormation(
                List.of(
                    new WingBackAtDRL(),
                    new CentralDefenderDeDC(),
                    new CentralDefenderDeDC(),
                    new WingBackSuDRL(),
                    new AnchorDeDM(),
                    new BoxToBoxMidfielderSuMC(),
                    new DeepLyingPlaymakerSuMC(),
                    new WingerSuAMRL(),
                    new WingerAtAMRL(),
                    new AdvancedForwardAtSC()),
                new GoalkeeperDeGK()),
            new FiveTwoThreeDmWideFormation(
                List.of(
                    new BallPlayingDefenderDeDC(),
                    new CentralDefenderCoDC(),
                    new WideCentreBackAtDC(),
                    new WingBackAtWBRL(),
                    new DeepLyingPlaymakerSuDM(),
                    new DefensiveMidfielderDeDM(),
                    new WingBackSuWBRL(),
                    new WingerSuAMRL(),
                    new WingerAtAMRL(),
                    new TargetForwardAtSC()),
                new GoalkeeperDeGK())));
  }
}
