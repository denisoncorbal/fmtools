package br.com.dgc.fmtools.formation_calculator_service.domain.model.tactical_styles;

import br.com.dgc.fmtools.formation_calculator_service.domain.model.TacticalStyle;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.formations.FiveTwoOneTwoDmAmFormation;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.formations.FiveTwoThreeDmWideFormation;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.formations.FiveTwoTwoOneDmAmFormation;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.AdvancedForwardAt;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.AttackingMidfielderSu;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.CentralDefenderDe;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.DeepLyingForwardSu;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.DefensiveMidfielderDe;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.EngancheSu;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.GoalkeeperDe;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.LiberoSu;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.RegistaSu;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.RoamingPlaymakerSu;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.TrequartistaAt;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.WingBackAu;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.WingBackDe;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.WingerSu;
import java.util.List;

public class CatenaccioTacticalStyle extends TacticalStyle {

  public CatenaccioTacticalStyle() {
    super(
        "Catenaccio",
        "defensive",
        List.of(
            new FiveTwoThreeDmWideFormation(
                List.of(
                    new CentralDefenderDe(),
                    new CentralDefenderDe(),
                    new LiberoSu(),
                    new WingBackAu(),
                    new WingBackAu(),
                    new RoamingPlaymakerSu(),
                    new DefensiveMidfielderDe(),
                    new WingerSu(),
                    new WingerSu(),
                    new TrequartistaAt()),
                new GoalkeeperDe()),
            new FiveTwoOneTwoDmAmFormation(
                List.of(
                    new CentralDefenderDe(),
                    new CentralDefenderDe(),
                    new LiberoSu(),
                    new WingBackDe(),
                    new WingBackDe(),
                    new DefensiveMidfielderDe(),
                    new RegistaSu(),
                    new TrequartistaAt(),
                    new AdvancedForwardAt(),
                    new DeepLyingForwardSu()),
                new GoalkeeperDe()),
            new FiveTwoTwoOneDmAmFormation(
                List.of(
                    new CentralDefenderDe(),
                    new CentralDefenderDe(),
                    new LiberoSu(),
                    new WingBackAu(),
                    new WingBackAu(),
                    new RoamingPlaymakerSu(),
                    new DefensiveMidfielderDe(),
                    new EngancheSu(),
                    new AttackingMidfielderSu(),
                    new TrequartistaAt()),
                new GoalkeeperDe())));
  }
}
