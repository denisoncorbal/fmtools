package br.com.dgc.fmtools.formation_calculator_service.domain.model.tactical_styles;

import br.com.dgc.fmtools.formation_calculator_service.domain.model.TacticalStyle;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.formations.FourFourTwoFormation;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.formations.FourThreeThreeDmWideFormation;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.formations.FourTwoFourDmWideFormation;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.BallWinningMidfielderDe;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.CentralDefenderDe;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.CentralMidfielderDe;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.DeepLyingPlaymakerDe;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.DeepLyingPlaymakerSu;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.DefensiveMidfielderDe;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.DefensiveWingerSu;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.FullBackAu;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.FullBackDe;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.FullBackSu;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.GoalkeeperDe;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.InvertedWingerSu;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.NoNonsenseCentreBackDe;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.PoacherAt;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.PressingForwardAt;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.PressingForwardDe;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.WideTargetForwardSu;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.WingerSu;
import java.util.List;

public class ParkTheBusTacticalStyle extends TacticalStyle {

  public ParkTheBusTacticalStyle() {
    super(
        "Park The Bus",
        "defensive",
        List.of(
            new FourFourTwoFormation(
                List.of(
                    new FullBackAu(),
                    new FullBackAu(),
                    new NoNonsenseCentreBackDe(),
                    new NoNonsenseCentreBackDe(),
                    new DefensiveWingerSu(),
                    new DefensiveWingerSu(),
                    new BallWinningMidfielderDe(),
                    new DeepLyingPlaymakerDe(),
                    new PressingForwardAt(),
                    new PressingForwardDe()),
                new GoalkeeperDe()),
            new FourTwoFourDmWideFormation(
                List.of(
                    new FullBackSu(),
                    new CentralDefenderDe(),
                    new NoNonsenseCentreBackDe(),
                    new FullBackAu(),
                    new DeepLyingPlaymakerSu(),
                    new DefensiveMidfielderDe(),
                    new InvertedWingerSu(),
                    new WideTargetForwardSu(),
                    new PoacherAt(),
                    new PressingForwardDe()),
                new GoalkeeperDe()),
            new FourThreeThreeDmWideFormation(
                List.of(
                    new FullBackSu(),
                    new CentralDefenderDe(),
                    new NoNonsenseCentreBackDe(),
                    new FullBackDe(),
                    new DefensiveMidfielderDe(),
                    new DeepLyingPlaymakerSu(),
                    new CentralMidfielderDe(),
                    new InvertedWingerSu(),
                    new WingerSu(),
                    new PressingForwardDe()),
                new GoalkeeperDe())));
  }
}
