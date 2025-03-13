package br.com.dgc.fmtools.formation_calculator_service.domain.model.tactical_styles;

import br.com.dgc.fmtools.formation_calculator_service.domain.model.TacticalStyle;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.formations.FourThreeThreeDmWideFormation;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.formations.FourTwoFourDmWideFormation;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.formations.FourTwoThreeOneDmAmWideFormation;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.AdvancedForwardAt;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.AttackingMidfielderAt;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.BallPlayingDefenderDe;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.BallWinningMidfielderDe;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.BoxToBoxMidfielderSu;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.CarrileroSu;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.CentralDefenderDe;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.DeepLyingPlaymakerDe;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.InsideForwardAt;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.InsideForwardSu;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.PressingForwardAt;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.PressingForwardSu;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.RoamingPlaymakerSu;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.SweeperKeeperAt;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.WingBackAt;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.WingBackSu;
import java.util.List;

public class GegenpressTacticalStyle extends TacticalStyle {

  public GegenpressTacticalStyle() {
    super(
        "Gegenpress",
        "positive",
        List.of(
            new FourThreeThreeDmWideFormation(
                List.of(
                    new WingBackSu(),
                    new WingBackSu(),
                    new BallPlayingDefenderDe(),
                    new BallPlayingDefenderDe(),
                    new DeepLyingPlaymakerDe(),
                    new BoxToBoxMidfielderSu(),
                    new CarrileroSu(),
                    new InsideForwardAt(),
                    new InsideForwardAt(),
                    new PressingForwardAt()),
                new SweeperKeeperAt()),
            new FourTwoThreeOneDmAmWideFormation(
                List.of(
                    new WingBackSu(),
                    new WingBackAt(),
                    new CentralDefenderDe(),
                    new BallPlayingDefenderDe(),
                    new RoamingPlaymakerSu(),
                    new BallWinningMidfielderDe(),
                    new InsideForwardAt(),
                    new InsideForwardSu(),
                    new AttackingMidfielderAt(),
                    new PressingForwardAt()),
                new SweeperKeeperAt()),
            new FourTwoFourDmWideFormation(
                List.of(
                    new WingBackSu(),
                    new WingBackSu(),
                    new BallPlayingDefenderDe(),
                    new CentralDefenderDe(),
                    new RoamingPlaymakerSu(),
                    new BallWinningMidfielderDe(),
                    new InsideForwardAt(),
                    new InsideForwardAt(),
                    new AdvancedForwardAt(),
                    new PressingForwardSu()),
                new SweeperKeeperAt())));
  }
}
