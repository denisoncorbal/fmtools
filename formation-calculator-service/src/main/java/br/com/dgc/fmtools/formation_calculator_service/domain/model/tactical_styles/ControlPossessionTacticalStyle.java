package br.com.dgc.fmtools.formation_calculator_service.domain.model.tactical_styles;

import br.com.dgc.fmtools.formation_calculator_service.domain.model.TacticalStyle;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.formations.FiveTwoThreeDmWideFormation;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.formations.FourThreeThreeDmWideFormation;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.formations.FourTwoThreeOneDmAmWideFormation;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.AdvancedPlaymakerSu;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.BallPlayingDefenderDe;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.BallWinningMidfielderDe;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.CentralDefenderCo;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.CentralDefenderDe;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.CompleteForwardAt;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.DefensiveMidfielderDe;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.DefensiveMidfielderSu;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.HalfBackDe;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.InsideForwardSu;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.InvertedWingerSu;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.MezzalaSu;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.RoamingPlaymakerSu;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.SweeperKeeperSu;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.WideCentreBackSu;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.WingBackAt;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.WingBackSu;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.WingerAt;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.WingerSu;
import java.util.List;

public class ControlPossessionTacticalStyle extends TacticalStyle {
  public ControlPossessionTacticalStyle() {
    super(
        "Control Possession",
        "balance",
        List.of(
            new FourTwoThreeOneDmAmWideFormation(
                List.of(
                    new WingBackSu(),
                    new WingBackSu(),
                    new CentralDefenderDe(),
                    new BallPlayingDefenderDe(),
                    new DefensiveMidfielderSu(),
                    new BallWinningMidfielderDe(),
                    new InvertedWingerSu(),
                    new WingerSu(),
                    new AdvancedPlaymakerSu(),
                    new CompleteForwardAt()),
                new SweeperKeeperSu()),
            new FourThreeThreeDmWideFormation(
                List.of(
                    new WingBackSu(),
                    new WingBackSu(),
                    new CentralDefenderDe(),
                    new BallPlayingDefenderDe(),
                    new HalfBackDe(),
                    new MezzalaSu(),
                    new AdvancedPlaymakerSu(),
                    new InvertedWingerSu(),
                    new WingerAt(),
                    new CompleteForwardAt()),
                new SweeperKeeperSu()),
            new FiveTwoThreeDmWideFormation(
                List.of(
                    new WideCentreBackSu(),
                    new CentralDefenderCo(),
                    new BallPlayingDefenderDe(),
                    new WingBackSu(),
                    new WingBackAt(),
                    new RoamingPlaymakerSu(),
                    new DefensiveMidfielderDe(),
                    new InvertedWingerSu(),
                    new InsideForwardSu(),
                    new CompleteForwardAt()),
                new SweeperKeeperSu())));
  }
}
