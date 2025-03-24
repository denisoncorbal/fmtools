package br.com.dgc.fmtools.formation_calculator_service.domain.model.tactical_styles;

import br.com.dgc.fmtools.formation_calculator_service.domain.model.TacticalStyle;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.formations.FiveTwoOneTwoDmAmFormation;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.formations.FiveTwoThreeDmWideFormation;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.formations.FiveTwoTwoOneDmAmFormation;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.attacking_midfielder_centre.AttackingMidfielderSuAMC;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.attacking_midfielder_centre.EngancheSuAMC;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.attacking_midfielder_centre.TrequartistaAtAMC;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.attacking_midfielder_right_left.WingerSuAMRL;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.defender_centre.CentralDefenderDeDC;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.defender_centre.LiberoSuDC;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.defensive_midfielder.DefensiveMidfielderDeDM;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.defensive_midfielder.RegistaSuDM;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.defensive_midfielder.RoamingPlaymakerSuDM;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.goalkeeper.GoalkeeperDeGK;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.striker_centre.AdvancedForwardAtSC;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.striker_centre.DeepLyingForwardSuSC;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.striker_centre.TrequartistaAtSC;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.wing_back_right_left.WingBackAuWBRL;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.wing_back_right_left.WingBackDeWBRL;
import java.util.List;

public class CatenaccioTacticalStyle extends TacticalStyle {

  public CatenaccioTacticalStyle() {
    super(
        "Catenaccio",
        "defensive",
        List.of(
            new FiveTwoThreeDmWideFormation(
                List.of(
                    new CentralDefenderDeDC(),
                    new CentralDefenderDeDC(),
                    new LiberoSuDC(),
                    new WingBackAuWBRL(),
                    new WingBackAuWBRL(),
                    new RoamingPlaymakerSuDM(),
                    new DefensiveMidfielderDeDM(),
                    new WingerSuAMRL(),
                    new WingerSuAMRL(),
                    new TrequartistaAtSC()),
                new GoalkeeperDeGK()),
            new FiveTwoOneTwoDmAmFormation(
                List.of(
                    new CentralDefenderDeDC(),
                    new CentralDefenderDeDC(),
                    new LiberoSuDC(),
                    new WingBackDeWBRL(),
                    new WingBackDeWBRL(),
                    new DefensiveMidfielderDeDM(),
                    new RegistaSuDM(),
                    new TrequartistaAtAMC(),
                    new AdvancedForwardAtSC(),
                    new DeepLyingForwardSuSC()),
                new GoalkeeperDeGK()),
            new FiveTwoTwoOneDmAmFormation(
                List.of(
                    new CentralDefenderDeDC(),
                    new CentralDefenderDeDC(),
                    new LiberoSuDC(),
                    new WingBackAuWBRL(),
                    new WingBackAuWBRL(),
                    new RoamingPlaymakerSuDM(),
                    new DefensiveMidfielderDeDM(),
                    new EngancheSuAMC(),
                    new AttackingMidfielderSuAMC(),
                    new TrequartistaAtSC()),
                new GoalkeeperDeGK())));
  }
}
