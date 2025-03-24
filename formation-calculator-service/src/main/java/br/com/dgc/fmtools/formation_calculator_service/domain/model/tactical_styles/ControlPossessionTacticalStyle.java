package br.com.dgc.fmtools.formation_calculator_service.domain.model.tactical_styles;

import br.com.dgc.fmtools.formation_calculator_service.domain.model.TacticalStyle;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.formations.FiveTwoThreeDmWideFormation;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.formations.FourThreeThreeDmWideFormation;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.formations.FourTwoThreeOneDmAmWideFormation;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.attacking_midfielder_centre.AdvancedPlaymakerSuAMC;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.attacking_midfielder_right_left.InsideForwardSuAMRL;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.attacking_midfielder_right_left.InvertedWingerSuAMRL;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.attacking_midfielder_right_left.WingerAtAMRL;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.attacking_midfielder_right_left.WingerSuAMRL;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.defender_centre.BallPlayingDefenderDeDC;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.defender_centre.CentralDefenderCoDC;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.defender_centre.CentralDefenderDeDC;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.defender_centre.WideCentreBackSuDC;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.defender_right_left.WingBackSuDRL;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.defensive_midfielder.BallWinningMidfielderDeDM;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.defensive_midfielder.DefensiveMidfielderDeDM;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.defensive_midfielder.DefensiveMidfielderSuDM;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.defensive_midfielder.HalfBackDeDM;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.defensive_midfielder.RoamingPlaymakerSuDM;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.goalkeeper.SweeperKeeperSuGK;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.midfielder_centre.AdvancedPlaymakerSuMC;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.midfielder_centre.MezzalaSuMC;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.striker_centre.CompleteForwardAtSC;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.wing_back_right_left.WingBackAtWBRL;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.wing_back_right_left.WingBackSuWBRL;
import java.util.List;

public class ControlPossessionTacticalStyle extends TacticalStyle {
  public ControlPossessionTacticalStyle() {
    super(
        "Control Possession",
        "balance",
        List.of(
            new FourTwoThreeOneDmAmWideFormation(
                List.of(
                    new WingBackSuDRL(),
                    new WingBackSuDRL(),
                    new CentralDefenderDeDC(),
                    new BallPlayingDefenderDeDC(),
                    new DefensiveMidfielderSuDM(),
                    new BallWinningMidfielderDeDM(),
                    new InvertedWingerSuAMRL(),
                    new WingerSuAMRL(),
                    new AdvancedPlaymakerSuAMC(),
                    new CompleteForwardAtSC()),
                new SweeperKeeperSuGK()),
            new FourThreeThreeDmWideFormation(
                List.of(
                    new WingBackSuDRL(),
                    new WingBackSuDRL(),
                    new CentralDefenderDeDC(),
                    new BallPlayingDefenderDeDC(),
                    new HalfBackDeDM(),
                    new MezzalaSuMC(),
                    new AdvancedPlaymakerSuMC(),
                    new InvertedWingerSuAMRL(),
                    new WingerAtAMRL(),
                    new CompleteForwardAtSC()),
                new SweeperKeeperSuGK()),
            new FiveTwoThreeDmWideFormation(
                List.of(
                    new WideCentreBackSuDC(),
                    new CentralDefenderCoDC(),
                    new BallPlayingDefenderDeDC(),
                    new WingBackSuWBRL(),
                    new WingBackAtWBRL(),
                    new RoamingPlaymakerSuDM(),
                    new DefensiveMidfielderDeDM(),
                    new InvertedWingerSuAMRL(),
                    new InsideForwardSuAMRL(),
                    new CompleteForwardAtSC()),
                new SweeperKeeperSuGK())));
  }
}
