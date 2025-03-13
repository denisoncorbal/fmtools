package br.com.dgc.fmtools.formation_calculator_service.domain.model.tactical_styles;

import br.com.dgc.fmtools.formation_calculator_service.domain.model.TacticalStyle;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.formations.FiveThreeTwoDmWbFormation;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.formations.FourFourTwoFormation;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.formations.FourThreeThreeDmWideFormation;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.AnchorDe;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.BallWinningMidfielderDe;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.BoxToBoxMidfielderSu;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.CentralDefenderCo;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.CentralMidfielderAt;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.CentralMidfielderSu;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.DefensiveMidfielderDe;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.FullBackAu;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.FullBackSu;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.GoalkeeperDe;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.NoNonsenseCentreBackDe;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.NoNonsenseFullBackDe;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.PoacherAt;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.PressingForwardAt;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.TargetForwardAt;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.TargetForwardSu;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.WideCentreBackDe;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.WingBackSu;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.WingerAt;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.WingerSu;
import java.util.List;

public class RouteOneTacticalStyle extends TacticalStyle {

  public RouteOneTacticalStyle() {
    super(
        "Route One",
        "balanced",
        List.of(
            new FourFourTwoFormation(
                List.of(
                    new FullBackAu(),
                    new NoNonsenseCentreBackDe(),
                    new NoNonsenseCentreBackDe(),
                    new FullBackSu(),
                    new WingerSu(),
                    new BoxToBoxMidfielderSu(),
                    new BallWinningMidfielderDe(),
                    new WingerAt(),
                    new PressingForwardAt(),
                    new TargetForwardAt()),
                new GoalkeeperDe()),
            new FourThreeThreeDmWideFormation(
                List.of(
                    new NoNonsenseFullBackDe(),
                    new NoNonsenseCentreBackDe(),
                    new NoNonsenseCentreBackDe(),
                    new FullBackSu(),
                    new AnchorDe(),
                    new BoxToBoxMidfielderSu(),
                    new CentralMidfielderSu(),
                    new WingerSu(),
                    new WingerAt(),
                    new TargetForwardAt()),
                new GoalkeeperDe()),
            new FiveThreeTwoDmWbFormation(
                List.of(
                    new NoNonsenseCentreBackDe(),
                    new CentralDefenderCo(),
                    new WideCentreBackDe(),
                    new WingBackSu(),
                    new WingBackSu(),
                    new DefensiveMidfielderDe(),
                    new BoxToBoxMidfielderSu(),
                    new CentralMidfielderAt(),
                    new PoacherAt(),
                    new TargetForwardSu()),
                new GoalkeeperDe())));
  }
}
