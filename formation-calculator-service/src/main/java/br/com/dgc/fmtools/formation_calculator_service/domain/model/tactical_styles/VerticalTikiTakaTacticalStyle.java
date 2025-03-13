package br.com.dgc.fmtools.formation_calculator_service.domain.model.tactical_styles;

import br.com.dgc.fmtools.formation_calculator_service.domain.model.TacticalStyle;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.formations.FourFourTwoDiamondNarrowFormation;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.formations.FourThreeThreeDmWideFormation;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.formations.FourTwoThreeOneDmAmWideFormation;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.AttackingMidfielderSu;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.BallPlayingDefenderDe;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.BoxToBoxMidfielderSu;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.CarrileroSu;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.CentralDefenderDe;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.CompleteForwardAt;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.DeepLyingForwardAt;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.DeepLyingPlaymakerSu;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.DefensiveMidfielderDe;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.FalseNineSu;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.InsideForwardSu;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.InvertedWingerSu;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.MezzalaSu;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.PressingForwardAt;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.RegistaSu;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.SweeperKeeperSu;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.WingBackAt;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.WingBackSu;
import java.util.List;

public class VerticalTikiTakaTacticalStyle extends TacticalStyle {

  public VerticalTikiTakaTacticalStyle() {
    super(
        "Vertical Tiki-Taka",
        "balanced",
        List.of(
            new FourThreeThreeDmWideFormation(
                List.of(
                    new WingBackSu(),
                    new BallPlayingDefenderDe(),
                    new CentralDefenderDe(),
                    new WingBackAt(),
                    new RegistaSu(),
                    new MezzalaSu(),
                    new BoxToBoxMidfielderSu(),
                    new InsideForwardSu(),
                    new InvertedWingerSu(),
                    new PressingForwardAt()),
                new SweeperKeeperSu()),
            new FourFourTwoDiamondNarrowFormation(
                List.of(
                    new WingBackSu(),
                    new CentralDefenderDe(),
                    new BallPlayingDefenderDe(),
                    new WingBackAt(),
                    new DeepLyingPlaymakerSu(),
                    new MezzalaSu(),
                    new CarrileroSu(),
                    new AttackingMidfielderSu(),
                    new CompleteForwardAt(),
                    new FalseNineSu()),
                new SweeperKeeperSu()),
            new FourTwoThreeOneDmAmWideFormation(
                List.of(
                    new WingBackSu(),
                    new WingBackSu(),
                    new BallPlayingDefenderDe(),
                    new CentralDefenderDe(),
                    new DeepLyingPlaymakerSu(),
                    new DefensiveMidfielderDe(),
                    new InvertedWingerSu(),
                    new AttackingMidfielderSu(),
                    new InsideForwardSu(),
                    new DeepLyingForwardAt()),
                new SweeperKeeperSu())));
  }
}
