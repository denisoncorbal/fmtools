package br.com.dgc.fmtools.formation_calculator_service.domain.model.tactical_styles;

import br.com.dgc.fmtools.formation_calculator_service.domain.model.TacticalStyle;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.formations.FiveTwoThreeDmWideFormation;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.formations.FourFourTwoFormation;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.formations.FourThreeThreeDmWideFormation;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.AdvancedForwardAt;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.AnchorDe;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.BallWinningMidfielderDe;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.BoxToBoxMidfielderSu;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.CentralDefenderCo;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.CentralDefenderDe;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.CentralMidfielderDe;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.CentralMidfielderSu;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.DeepLyingForwardAt;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.DeepLyingPlaymakerSu;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.DefensiveMidfielderDe;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.FullBackAu;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.GoalkeeperDe;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.InsideForwardAt;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.InsideForwardSu;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.InvertedWingerSu;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.NoNonsenseCentreBackDe;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.PressingForwardDe;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.SweeperKeeperDe;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.WideMidfielderSu;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.WingBackAu;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.WingBackSu;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.WingerSu;
import java.util.List;

public class DirectCounterAttackTacticalStyle extends TacticalStyle {

  public DirectCounterAttackTacticalStyle() {
    super(
        "Direct Counter-Attack",
        "cautious",
        List.of(
            new FourFourTwoFormation(
                List.of(
                    new FullBackAu(),
                    new FullBackAu(),
                    new NoNonsenseCentreBackDe(),
                    new CentralDefenderDe(),
                    new WideMidfielderSu(),
                    new CentralMidfielderSu(),
                    new BallWinningMidfielderDe(),
                    new WingerSu(),
                    new AdvancedForwardAt(),
                    new PressingForwardDe()),
                new SweeperKeeperDe()),
            new FourThreeThreeDmWideFormation(
                List.of(
                    new WingBackAu(),
                    new NoNonsenseCentreBackDe(),
                    new CentralDefenderDe(),
                    new FullBackAu(),
                    new AnchorDe(),
                    new BoxToBoxMidfielderSu(),
                    new CentralMidfielderDe(),
                    new InsideForwardSu(),
                    new WingerSu(),
                    new AdvancedForwardAt()),
                new SweeperKeeperDe()),
            new FiveTwoThreeDmWideFormation(
                List.of(
                    new CentralDefenderDe(),
                    new CentralDefenderDe(),
                    new CentralDefenderCo(),
                    new WingBackSu(),
                    new WingBackSu(),
                    new DeepLyingPlaymakerSu(),
                    new DefensiveMidfielderDe(),
                    new InsideForwardAt(),
                    new InvertedWingerSu(),
                    new DeepLyingForwardAt()),
                new GoalkeeperDe())));
  }
}
