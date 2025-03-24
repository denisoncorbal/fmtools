package br.com.dgc.fmtools.formation_calculator_service.domain.model.tactical_styles;

import br.com.dgc.fmtools.formation_calculator_service.domain.model.TacticalStyle;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.formations.FiveTwoThreeDmWideFormation;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.formations.FourThreeThreeDmWideFormation;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.formations.FourTwoThreeOneDmAmWideFormation;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.attacking_midfielder_centre.AttackingMidfielderSuAMC;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.attacking_midfielder_right_left.AdvancedPlaymakerSuAMRL;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.attacking_midfielder_right_left.InsideForwardAtAMRL;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.attacking_midfielder_right_left.InsideForwardSuAMRL;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.attacking_midfielder_right_left.InvertedWingerSuAMRL;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.attacking_midfielder_right_left.WingerSuAMRL;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.defender_centre.BallPlayingDefenderDeDC;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.defender_centre.CentralDefenderCoDC;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.defender_centre.CentralDefenderDeDC;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.defender_centre.WideCentreBackSuDC;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.defender_right_left.WingBackAtDRL;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.defender_right_left.WingBackSuDRL;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.defensive_midfielder.DeepLyingPlaymakerSuDM;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.defensive_midfielder.DefensiveMidfielderDeDM;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.goalkeeper.GoalkeeperDeGK;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.goalkeeper.SweeperKeeperAtGK;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.midfielder_centre.AdvancedPlaymakerAtMC;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.midfielder_centre.RoamingPlaymakerSuMC;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.striker_centre.CompleteForwardAtSC;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.striker_centre.DeepLyingForwardAtSC;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.wing_back_right_left.WingBackSuWBRL;
import java.util.List;

public class TikiTakaTacticalStyle extends TacticalStyle {

  public TikiTakaTacticalStyle() {
    super(
        "Tiki-Taka",
        "positive",
        List.of(
            new FourThreeThreeDmWideFormation(
                List.of(
                    new WingBackSuDRL(),
                    new WingBackSuDRL(),
                    new CentralDefenderDeDC(),
                    new BallPlayingDefenderDeDC(),
                    new DeepLyingPlaymakerSuDM(),
                    new RoamingPlaymakerSuMC(),
                    new AdvancedPlaymakerAtMC(),
                    new InsideForwardSuAMRL(),
                    new WingerSuAMRL(),
                    new DeepLyingForwardAtSC()),
                new SweeperKeeperAtGK()),
            new FourTwoThreeOneDmAmWideFormation(
                List.of(
                    new WingBackSuDRL(),
                    new WingBackAtDRL(),
                    new CentralDefenderDeDC(),
                    new BallPlayingDefenderDeDC(),
                    new DeepLyingPlaymakerSuDM(),
                    new DefensiveMidfielderDeDM(),
                    new InsideForwardAtAMRL(),
                    new AttackingMidfielderSuAMC(),
                    new InvertedWingerSuAMRL(),
                    new CompleteForwardAtSC()),
                new GoalkeeperDeGK()),
            new FiveTwoThreeDmWideFormation(
                List.of(
                    new WideCentreBackSuDC(),
                    new CentralDefenderCoDC(),
                    new BallPlayingDefenderDeDC(),
                    new WingBackSuWBRL(),
                    new WingBackSuWBRL(),
                    new DeepLyingPlaymakerSuDM(),
                    new DefensiveMidfielderDeDM(),
                    new AdvancedPlaymakerSuAMRL(),
                    new InvertedWingerSuAMRL(),
                    new CompleteForwardAtSC()),
                new SweeperKeeperAtGK())));
  }
}
