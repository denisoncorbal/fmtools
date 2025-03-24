package br.com.dgc.fmtools.formation_calculator_service.domain.model.tactical_styles;

import br.com.dgc.fmtools.formation_calculator_service.domain.model.TacticalStyle;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.formations.FourFourTwoDiamondNarrowFormation;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.formations.FourThreeThreeDmWideFormation;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.formations.FourTwoThreeOneDmAmWideFormation;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.attacking_midfielder_centre.AttackingMidfielderSuAMC;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.attacking_midfielder_right_left.InsideForwardSuAMRL;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.attacking_midfielder_right_left.InvertedWingerSuAMRL;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.defender_centre.BallPlayingDefenderDeDC;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.defender_centre.CentralDefenderDeDC;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.defender_right_left.WingBackAtDRL;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.defender_right_left.WingBackSuDRL;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.defensive_midfielder.DeepLyingPlaymakerSuDM;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.defensive_midfielder.DefensiveMidfielderDeDM;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.defensive_midfielder.RegistaSuDM;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.goalkeeper.SweeperKeeperSuGK;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.midfielder_centre.BoxToBoxMidfielderSuMC;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.midfielder_centre.CarrileroSuMC;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.midfielder_centre.MezzalaSuMC;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.striker_centre.CompleteForwardAtSC;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.striker_centre.DeepLyingForwardAtSC;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.striker_centre.FalseNineSuSC;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.striker_centre.PressingForwardAtSC;
import java.util.List;

public class VerticalTikiTakaTacticalStyle extends TacticalStyle {

  public VerticalTikiTakaTacticalStyle() {
    super(
        "Vertical Tiki-Taka",
        "balanced",
        List.of(
            new FourThreeThreeDmWideFormation(
                List.of(
                    new WingBackSuDRL(),
                    new BallPlayingDefenderDeDC(),
                    new CentralDefenderDeDC(),
                    new WingBackAtDRL(),
                    new RegistaSuDM(),
                    new MezzalaSuMC(),
                    new BoxToBoxMidfielderSuMC(),
                    new InsideForwardSuAMRL(),
                    new InvertedWingerSuAMRL(),
                    new PressingForwardAtSC()),
                new SweeperKeeperSuGK()),
            new FourFourTwoDiamondNarrowFormation(
                List.of(
                    new WingBackSuDRL(),
                    new CentralDefenderDeDC(),
                    new BallPlayingDefenderDeDC(),
                    new WingBackAtDRL(),
                    new DeepLyingPlaymakerSuDM(),
                    new MezzalaSuMC(),
                    new CarrileroSuMC(),
                    new AttackingMidfielderSuAMC(),
                    new CompleteForwardAtSC(),
                    new FalseNineSuSC()),
                new SweeperKeeperSuGK()),
            new FourTwoThreeOneDmAmWideFormation(
                List.of(
                    new WingBackSuDRL(),
                    new WingBackSuDRL(),
                    new BallPlayingDefenderDeDC(),
                    new CentralDefenderDeDC(),
                    new DeepLyingPlaymakerSuDM(),
                    new DefensiveMidfielderDeDM(),
                    new InvertedWingerSuAMRL(),
                    new AttackingMidfielderSuAMC(),
                    new InsideForwardSuAMRL(),
                    new DeepLyingForwardAtSC()),
                new SweeperKeeperSuGK())));
  }
}
