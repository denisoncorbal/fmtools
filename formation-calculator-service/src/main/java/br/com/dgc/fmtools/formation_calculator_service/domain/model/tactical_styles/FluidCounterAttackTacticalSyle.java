package br.com.dgc.fmtools.formation_calculator_service.domain.model.tactical_styles;

import br.com.dgc.fmtools.formation_calculator_service.domain.model.TacticalStyle;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.formations.FiveThreeTwoDmWbFormation;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.formations.FourThreeThreeDmWideFormation;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.formations.FourTwoThreeOneDmAmWideFormation;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.AdvancedForwardAt;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.AttackingMidfielderSu;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.BallPlayingDefenderDe;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.BallWinningMidfielderDe;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.BoxToBoxMidfielderSu;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.CentralDefenderCo;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.CentralDefenderDe;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.CentralMidfielderSu;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.DeepLyingForwardSu;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.DefensiveMidfielderDe;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.InvertedWingerSu;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.MezzalaSu;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.PressingForwardAt;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.SweeperKeeperDe;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.WideCentreBackDe;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.WingBackAu;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.WingBackSu;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.WingerSu;
import java.util.List;

public class FluidCounterAttackTacticalSyle extends TacticalStyle {

  public FluidCounterAttackTacticalSyle() {
    super(
        "Fluid Counter-Attack",
        "cautious",
        List.of(
            new FourThreeThreeDmWideFormation(
                List.of(
                    new WingBackAu(),
                    new WingBackAu(),
                    new BallPlayingDefenderDe(),
                    new CentralDefenderDe(),
                    new DefensiveMidfielderDe(),
                    new BoxToBoxMidfielderSu(),
                    new CentralMidfielderSu(),
                    new InvertedWingerSu(),
                    new WingerSu(),
                    new PressingForwardAt()),
                new SweeperKeeperDe()),
            new FourTwoThreeOneDmAmWideFormation(
                List.of(
                    new WingBackAu(),
                    new WingBackAu(),
                    new BallPlayingDefenderDe(),
                    new CentralDefenderDe(),
                    new DefensiveMidfielderDe(),
                    new BallWinningMidfielderDe(),
                    new InvertedWingerSu(),
                    new AttackingMidfielderSu(),
                    new WingerSu(),
                    new AdvancedForwardAt()),
                new SweeperKeeperDe()),
            new FiveThreeTwoDmWbFormation(
                List.of(
                    new WideCentreBackDe(),
                    new CentralDefenderCo(),
                    new CentralDefenderDe(),
                    new WingBackSu(),
                    new WingBackSu(),
                    new BallWinningMidfielderDe(),
                    new BoxToBoxMidfielderSu(),
                    new MezzalaSu(),
                    new PressingForwardAt(),
                    new DeepLyingForwardSu()),
                new SweeperKeeperDe())));
  }
}
