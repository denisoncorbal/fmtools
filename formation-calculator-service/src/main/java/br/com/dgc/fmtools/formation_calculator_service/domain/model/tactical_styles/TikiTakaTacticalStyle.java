package br.com.dgc.fmtools.formation_calculator_service.domain.model.tactical_styles;

import br.com.dgc.fmtools.formation_calculator_service.domain.model.TacticalStyle;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.formations.FiveTwoThreeDmWideFormation;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.formations.FourThreeThreeDmWideFormation;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.formations.FourTwoThreeOneDmAmWideFormation;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.AdvancedPlaymakerAt;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.AdvancedPlaymakerSu;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.AttackingMidfielderSu;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.BallPlayingDefenderDe;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.CentralDefenderCo;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.CentralDefenderDe;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.CompleteForwardAt;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.DeepLyingForwardAt;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.DeepLyingPlaymakerSu;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.DefensiveMidfielderDe;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.GoalkeeperDe;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.InsideForwardAt;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.InsideForwardSu;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.InvertedWingerSu;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.RoamingPlaymakerSu;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.SweeperKeeperAt;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.WideCentreBackSu;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.WingBackAt;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.WingBackSu;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.WingerSu;
import java.util.List;

public class TikiTakaTacticalStyle extends TacticalStyle {

  public TikiTakaTacticalStyle() {
    super(
        "Tiki-Taka",
        "positive",
        List.of(
            new FourThreeThreeDmWideFormation(
                List.of(
                    new WingBackSu(),
                    new WingBackSu(),
                    new CentralDefenderDe(),
                    new BallPlayingDefenderDe(),
                    new DeepLyingPlaymakerSu(),
                    new RoamingPlaymakerSu(),
                    new AdvancedPlaymakerAt(),
                    new InsideForwardSu(),
                    new WingerSu(),
                    new DeepLyingForwardAt()),
                new SweeperKeeperAt()),
            new FourTwoThreeOneDmAmWideFormation(
                List.of(
                    new WingBackSu(),
                    new WingBackAt(),
                    new CentralDefenderDe(),
                    new BallPlayingDefenderDe(),
                    new DeepLyingPlaymakerSu(),
                    new DefensiveMidfielderDe(),
                    new InsideForwardAt(),
                    new AttackingMidfielderSu(),
                    new InvertedWingerSu(),
                    new CompleteForwardAt()),
                new GoalkeeperDe()),
            new FiveTwoThreeDmWideFormation(
                List.of(
                    new WideCentreBackSu(),
                    new CentralDefenderCo(),
                    new BallPlayingDefenderDe(),
                    new WingBackSu(),
                    new WingBackSu(),
                    new DeepLyingPlaymakerSu(),
                    new DefensiveMidfielderDe(),
                    new AdvancedPlaymakerSu(),
                    new InvertedWingerSu(),
                    new CompleteForwardAt()),
                new SweeperKeeperAt())));
  }
}
