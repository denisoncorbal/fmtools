package br.com.dgc.fmtools.formation_calculator_service.domain.model.tactical_styles;

import br.com.dgc.fmtools.formation_calculator_service.domain.model.TacticalStyle;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.formations.FourFourTwoFormation;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.formations.FourThreeThreeDmWideFormation;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.formations.FourTwoFourDmWideFormation;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.attacking_midfielder_right_left.InvertedWingerSuAMRL;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.attacking_midfielder_right_left.WideTargetForwardSuAMRL;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.attacking_midfielder_right_left.WingerSuAMRL;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.defender_centre.CentralDefenderDeDC;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.defender_centre.NoNonsenseCentreBackDeDC;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.defender_right_left.FullBackAuDRL;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.defender_right_left.FullBackDeDRL;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.defender_right_left.FullBackSuDRL;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.defensive_midfielder.DeepLyingPlaymakerSuDM;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.defensive_midfielder.DefensiveMidfielderDeDM;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.goalkeeper.GoalkeeperDeGK;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.midfielder_centre.BallWinningMidfielderDeMC;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.midfielder_centre.CentralMidfielderDeMC;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.midfielder_centre.DeepLyingPlaymakerDeMC;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.midfielder_centre.DeepLyingPlaymakerSuMC;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.midfielder_right_left.DefensiveWingerSuMRL;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.striker_centre.PoacherAtSC;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.striker_centre.PressingForwardAtSC;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.striker_centre.PressingForwardDeSC;
import java.util.List;

public class ParkTheBusTacticalStyle extends TacticalStyle {

  public ParkTheBusTacticalStyle() {
    super(
        "Park The Bus",
        "defensive",
        List.of(
            new FourFourTwoFormation(
                List.of(
                    new FullBackAuDRL(),
                    new FullBackAuDRL(),
                    new NoNonsenseCentreBackDeDC(),
                    new NoNonsenseCentreBackDeDC(),
                    new DefensiveWingerSuMRL(),
                    new DefensiveWingerSuMRL(),
                    new BallWinningMidfielderDeMC(),
                    new DeepLyingPlaymakerDeMC(),
                    new PressingForwardAtSC(),
                    new PressingForwardDeSC()),
                new GoalkeeperDeGK()),
            new FourTwoFourDmWideFormation(
                List.of(
                    new FullBackSuDRL(),
                    new CentralDefenderDeDC(),
                    new NoNonsenseCentreBackDeDC(),
                    new FullBackAuDRL(),
                    new DeepLyingPlaymakerSuDM(),
                    new DefensiveMidfielderDeDM(),
                    new InvertedWingerSuAMRL(),
                    new WideTargetForwardSuAMRL(),
                    new PoacherAtSC(),
                    new PressingForwardDeSC()),
                new GoalkeeperDeGK()),
            new FourThreeThreeDmWideFormation(
                List.of(
                    new FullBackSuDRL(),
                    new CentralDefenderDeDC(),
                    new NoNonsenseCentreBackDeDC(),
                    new FullBackDeDRL(),
                    new DefensiveMidfielderDeDM(),
                    new DeepLyingPlaymakerSuMC(),
                    new CentralMidfielderDeMC(),
                    new InvertedWingerSuAMRL(),
                    new WingerSuAMRL(),
                    new PressingForwardDeSC()),
                new GoalkeeperDeGK())));
  }
}
