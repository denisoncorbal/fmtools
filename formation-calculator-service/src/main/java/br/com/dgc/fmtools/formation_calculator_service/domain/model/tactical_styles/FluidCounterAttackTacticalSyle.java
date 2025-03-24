package br.com.dgc.fmtools.formation_calculator_service.domain.model.tactical_styles;

import br.com.dgc.fmtools.formation_calculator_service.domain.model.TacticalStyle;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.formations.FiveThreeTwoDmWbFormation;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.formations.FourThreeThreeDmWideFormation;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.formations.FourTwoThreeOneDmAmWideFormation;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.attacking_midfielder_centre.AttackingMidfielderSuAMC;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.attacking_midfielder_right_left.InvertedWingerSuAMRL;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.attacking_midfielder_right_left.WingerSuAMRL;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.defender_centre.BallPlayingDefenderDeDC;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.defender_centre.CentralDefenderCoDC;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.defender_centre.CentralDefenderDeDC;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.defender_centre.WideCentreBackDeDC;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.defender_right_left.WingBackAuDRL;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.defensive_midfielder.BallWinningMidfielderDeDM;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.defensive_midfielder.DefensiveMidfielderDeDM;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.goalkeeper.SweeperKeeperDeGK;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.midfielder_centre.BoxToBoxMidfielderSuMC;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.midfielder_centre.CentralMidfielderSuMC;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.midfielder_centre.MezzalaSuMC;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.striker_centre.AdvancedForwardAtSC;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.striker_centre.DeepLyingForwardSuSC;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.striker_centre.PressingForwardAtSC;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.positions.wing_back_right_left.WingBackSuWBRL;
import java.util.List;

public class FluidCounterAttackTacticalSyle extends TacticalStyle {

  public FluidCounterAttackTacticalSyle() {
    super(
        "Fluid Counter-Attack",
        "cautious",
        List.of(
            new FourThreeThreeDmWideFormation(
                List.of(
                    new WingBackAuDRL(),
                    new WingBackAuDRL(),
                    new BallPlayingDefenderDeDC(),
                    new CentralDefenderDeDC(),
                    new DefensiveMidfielderDeDM(),
                    new BoxToBoxMidfielderSuMC(),
                    new CentralMidfielderSuMC(),
                    new InvertedWingerSuAMRL(),
                    new WingerSuAMRL(),
                    new PressingForwardAtSC()),
                new SweeperKeeperDeGK()),
            new FourTwoThreeOneDmAmWideFormation(
                List.of(
                    new WingBackAuDRL(),
                    new WingBackAuDRL(),
                    new BallPlayingDefenderDeDC(),
                    new CentralDefenderDeDC(),
                    new DefensiveMidfielderDeDM(),
                    new BallWinningMidfielderDeDM(),
                    new InvertedWingerSuAMRL(),
                    new AttackingMidfielderSuAMC(),
                    new WingerSuAMRL(),
                    new AdvancedForwardAtSC()),
                new SweeperKeeperDeGK()),
            new FiveThreeTwoDmWbFormation(
                List.of(
                    new WideCentreBackDeDC(),
                    new CentralDefenderCoDC(),
                    new CentralDefenderDeDC(),
                    new WingBackSuWBRL(),
                    new WingBackSuWBRL(),
                    new BallWinningMidfielderDeDM(),
                    new BoxToBoxMidfielderSuMC(),
                    new MezzalaSuMC(),
                    new PressingForwardAtSC(),
                    new DeepLyingForwardSuSC()),
                new SweeperKeeperDeGK())));
  }
}
