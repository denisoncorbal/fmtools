package br.com.dgc.fmtools.formation_calculator_service.domain.model.tactical_styles;

import br.com.dgc.fmtools.formation_calculator_service.domain.model.TacticalStyle;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.formations.FiveTwoThreeDmWideFormation;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.formations.FourFourTwoFormation;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.formations.FourThreeThreeDmWideFormation;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.AdvancedForwardAt;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.AnchorDe;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.BallPlayingDefenderDe;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.BallWinningMidfielderDe;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.BoxToBoxMidfielderSu;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.CentralDefenderCo;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.CentralDefenderDe;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.DeepLyingForwardSu;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.DeepLyingPlaymakerSu;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.DefensiveMidfielderDe;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.GoalkeeperDe;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.TargetForwardAt;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.WideCentreBackAt;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.WingBackAt;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.WingBackSu;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.WingerAt;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.WingerSu;
import java.util.List;

public class WingPlayTacticalStyle extends TacticalStyle {

  public WingPlayTacticalStyle() {
    super(
        "Wing Play Tactical Style",
        "balanced",
        List.of(
            new FourFourTwoFormation(
                List.of(
                    new WingBackAt(),
                    new CentralDefenderDe(),
                    new CentralDefenderDe(),
                    new WingBackSu(),
                    new WingerSu(),
                    new BoxToBoxMidfielderSu(),
                    new BallWinningMidfielderDe(),
                    new WingerAt(),
                    new AdvancedForwardAt(),
                    new DeepLyingForwardSu()),
                new GoalkeeperDe()),
            new FourThreeThreeDmWideFormation(
                List.of(
                    new WingBackAt(),
                    new CentralDefenderDe(),
                    new CentralDefenderDe(),
                    new WingBackSu(),
                    new AnchorDe(),
                    new BoxToBoxMidfielderSu(),
                    new DeepLyingPlaymakerSu(),
                    new WingerSu(),
                    new WingerAt(),
                    new AdvancedForwardAt()),
                new GoalkeeperDe()),
            new FiveTwoThreeDmWideFormation(
                List.of(
                    new BallPlayingDefenderDe(),
                    new CentralDefenderCo(),
                    new WideCentreBackAt(),
                    new WingBackAt(),
                    new DeepLyingPlaymakerSu(),
                    new DefensiveMidfielderDe(),
                    new WingBackSu(),
                    new WingerSu(),
                    new WingerAt(),
                    new TargetForwardAt()),
                new GoalkeeperDe())));
  }
}
