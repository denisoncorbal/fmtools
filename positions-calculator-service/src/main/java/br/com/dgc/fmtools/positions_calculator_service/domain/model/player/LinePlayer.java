package br.com.dgc.fmtools.positions_calculator_service.domain.model.player;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.SuitablePosition;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.attacking_midfielder_centre.AdvancedPlaymakerAtAMC;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.attacking_midfielder_centre.AdvancedPlaymakerSuAMC;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.attacking_midfielder_centre.AttackingMidfielderAtAMC;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.attacking_midfielder_centre.AttackingMidfielderSuAMC;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.attacking_midfielder_centre.EngancheSuAMC;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.attacking_midfielder_centre.ShadowStrikerAtAMC;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.attacking_midfielder_centre.TrequartistaAtAMC;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.attacking_midfielder_right_left.AdvancedPlaymakerAtAMRL;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.attacking_midfielder_right_left.AdvancedPlaymakerSuAMRL;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.attacking_midfielder_right_left.InsideForwardAtAMRL;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.attacking_midfielder_right_left.InsideForwardSuAMRL;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.attacking_midfielder_right_left.InvertedWingerAtAMRL;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.attacking_midfielder_right_left.InvertedWingerSuAMRL;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.attacking_midfielder_right_left.RaumdeuterAtAMRL;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.attacking_midfielder_right_left.TrequartistaAtAMRL;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.attacking_midfielder_right_left.WideTargetForwardAtAMRL;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.attacking_midfielder_right_left.WideTargetForwardSuAMRL;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.attacking_midfielder_right_left.WingerAtAMRL;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.attacking_midfielder_right_left.WingerSuAMRL;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.defender_centre.BallPlayingDefenderCoDC;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.defender_centre.BallPlayingDefenderDeDC;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.defender_centre.BallPlayingDefenderStDC;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.defender_centre.CentralDefenderCoDC;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.defender_centre.CentralDefenderDeDC;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.defender_centre.CentralDefenderStDC;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.defender_centre.LiberoAtDC;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.defender_centre.LiberoSuDC;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.defender_centre.NoNonsenseCentreBackCoDC;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.defender_centre.NoNonsenseCentreBackDeDC;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.defender_centre.NoNonsenseCentreBackStDC;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.defender_centre.WideCentreBackAtDC;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.defender_centre.WideCentreBackDeDC;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.defender_centre.WideCentreBackSuDC;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.defender_right_left.CompleteWingBackAtDRL;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.defender_right_left.CompleteWingBackSuDRL;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.defender_right_left.FullBackAtDRL;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.defender_right_left.FullBackAuDRL;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.defender_right_left.FullBackDeDRL;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.defender_right_left.FullBackSuDRL;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.defender_right_left.InvertedWingBackAtDRL;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.defender_right_left.InvertedWingBackAuDRL;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.defender_right_left.InvertedWingBackDeDRL;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.defender_right_left.InvertedWingBackSuDRL;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.defender_right_left.NoNonsenseFullBackDeDRL;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.defender_right_left.WingBackAtDRL;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.defender_right_left.WingBackDeDRL;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.defender_right_left.WingBackSuDRL;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.defensive_midfielder.AnchorDeDM;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.defensive_midfielder.BallWinningMidfielderDeDM;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.defensive_midfielder.BallWinningMidfielderSuDM;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.defensive_midfielder.DeepLyingPlaymakerDeDM;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.defensive_midfielder.DeepLyingPlaymakerSuDM;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.defensive_midfielder.DefensiveMidfielderDeDM;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.defensive_midfielder.DefensiveMidfielderSuDM;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.defensive_midfielder.HalfBackDeDM;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.defensive_midfielder.RegistaSuDM;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.defensive_midfielder.RoamingPlaymakerSuDM;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.defensive_midfielder.SegundoVolanteAtDM;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.defensive_midfielder.SegundoVolanteSuDM;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.midfielder_centre.AdvancedPlaymakerAtMC;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.midfielder_centre.AdvancedPlaymakerSuMC;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.midfielder_centre.BallWinningMidfielderDeMC;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.midfielder_centre.BallWinningMidfielderSuMC;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.midfielder_centre.BoxToBoxMidfielderSuMC;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.midfielder_centre.CarrileroSuMC;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.midfielder_centre.CentralMidfielderAtMC;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.midfielder_centre.CentralMidfielderDeMC;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.midfielder_centre.CentralMidfielderSuMC;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.midfielder_centre.DeepLyingPlaymakerDeMC;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.midfielder_centre.DeepLyingPlaymakerSuMC;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.midfielder_centre.MezzalaAtMC;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.midfielder_centre.MezzalaSuMC;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.midfielder_centre.RoamingPlaymakerSuMC;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.midfielder_right_left.DefensiveWingerDeMRL;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.midfielder_right_left.DefensiveWingerSuMRL;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.midfielder_right_left.InvertedWingerAtMRL;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.midfielder_right_left.InvertedWingerSuMRL;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.midfielder_right_left.WideMidfielderAtMRL;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.midfielder_right_left.WideMidfielderDeMRL;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.midfielder_right_left.WideMidfielderSuMRL;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.midfielder_right_left.WidePlaymakerAtMRL;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.midfielder_right_left.WidePlaymakerSuMRL;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.midfielder_right_left.WingerAtMRL;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.midfielder_right_left.WingerSuMRL;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.striker_centre.AdvancedForwardAtSC;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.striker_centre.CompleteForwardAtSC;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.striker_centre.CompleteForwardSuSC;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.striker_centre.DeepLyingForwardAtSC;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.striker_centre.DeepLyingForwardSuSC;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.striker_centre.FalseNineSuSC;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.striker_centre.PoacherAtSC;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.striker_centre.PressingForwardAtSC;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.striker_centre.PressingForwardDeSC;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.striker_centre.PressingForwardSuSC;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.striker_centre.TargetForwardAtSC;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.striker_centre.TargetForwardSuSC;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.striker_centre.TrequartistaAtSC;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.wing_back_right_left.CompleteWingBackAtWBRL;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.wing_back_right_left.CompleteWingBackSuWBRL;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.wing_back_right_left.InvertedWingBackAtWBRL;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.wing_back_right_left.InvertedWingBackDeWBRL;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.wing_back_right_left.InvertedWingBackSuWBRL;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.wing_back_right_left.WingBackAtWBRL;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.wing_back_right_left.WingBackAuWBRL;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.wing_back_right_left.WingBackDeWBRL;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.wing_back_right_left.WingBackSuWBRL;
import java.util.ArrayList;
import java.util.List;

public class LinePlayer extends Player {

  private int corners;
  private int crossing;
  private int dribbling;
  private int finishing;
  private int heading;
  private int longShots;
  private int longThrows;
  private int marking;
  private int tackling;

  public LinePlayer() {
    super();
  }

  public LinePlayer(
      String name,
      int aggression,
      int anticipation,
      int bravery,
      int composure,
      int concentration,
      int decisions,
      int determination,
      int flair,
      int leadership,
      int offTheBall,
      int positioning,
      int teamwork,
      int vision,
      int workRate,
      int acceleration,
      int agility,
      int balance,
      int jumpingReach,
      int naturalFitness,
      int pace,
      int stamina,
      int strength,
      int freeKickTaking,
      int penaltyTaking,
      int technique,
      int firstTouch,
      int passing,
      int corners,
      int crossing,
      int dribbling,
      int finishing,
      int heading,
      int longShots,
      int longThrows,
      int marking,
      int tackling) {
    super(
        name,
        aggression,
        anticipation,
        bravery,
        composure,
        concentration,
        decisions,
        determination,
        flair,
        leadership,
        offTheBall,
        positioning,
        teamwork,
        vision,
        workRate,
        acceleration,
        agility,
        balance,
        jumpingReach,
        naturalFitness,
        pace,
        stamina,
        strength,
        freeKickTaking,
        penaltyTaking,
        technique,
        firstTouch,
        passing);
    this.corners = corners;
    this.crossing = crossing;
    this.dribbling = dribbling;
    this.finishing = finishing;
    this.heading = heading;
    this.longShots = longShots;
    this.longThrows = longThrows;
    this.marking = marking;
    this.tackling = tackling;
  }

  public LinePlayer(LinePlayer initPlayer) {
    super(
        initPlayer.name,
        initPlayer.aggression,
        initPlayer.anticipation,
        initPlayer.bravery,
        initPlayer.composure,
        initPlayer.concentration,
        initPlayer.decisions,
        initPlayer.determination,
        initPlayer.flair,
        initPlayer.leadership,
        initPlayer.offTheBall,
        initPlayer.positioning,
        initPlayer.teamwork,
        initPlayer.vision,
        initPlayer.workRate,
        initPlayer.acceleration,
        initPlayer.agility,
        initPlayer.balance,
        initPlayer.jumpingReach,
        initPlayer.naturalFitness,
        initPlayer.pace,
        initPlayer.stamina,
        initPlayer.strength,
        initPlayer.freeKickTaking,
        initPlayer.penaltyTaking,
        initPlayer.technique,
        initPlayer.firstTouch,
        initPlayer.passing);
    this.corners = initPlayer.corners;
    this.crossing = initPlayer.crossing;
    this.dribbling = initPlayer.dribbling;
    this.finishing = initPlayer.finishing;
    this.heading = initPlayer.heading;
    this.longShots = initPlayer.longShots;
    this.longThrows = initPlayer.longThrows;
    this.marking = initPlayer.marking;
    this.tackling = initPlayer.tackling;
  }

  @Override
  public List<SuitablePosition> calculateSuitablePositions() {
    List<SuitablePosition> suitablePositions = new ArrayList<>();

    suitablePositions.add(this.calculateSuitablePosition(new AdvancedForwardAtSC(this)));
    suitablePositions.add(this.calculateSuitablePosition(new AdvancedPlaymakerAtAMC(this)));
    suitablePositions.add(this.calculateSuitablePosition(new AdvancedPlaymakerAtAMRL(this)));
    suitablePositions.add(this.calculateSuitablePosition(new AdvancedPlaymakerAtMC(this)));
    suitablePositions.add(this.calculateSuitablePosition(new AdvancedPlaymakerSuAMC(this)));
    suitablePositions.add(this.calculateSuitablePosition(new AdvancedPlaymakerSuAMRL(this)));
    suitablePositions.add(this.calculateSuitablePosition(new AdvancedPlaymakerSuMC(this)));
    suitablePositions.add(this.calculateSuitablePosition(new AnchorDeDM(this)));
    suitablePositions.add(this.calculateSuitablePosition(new AttackingMidfielderAtAMC(this)));
    suitablePositions.add(this.calculateSuitablePosition(new AttackingMidfielderSuAMC(this)));
    suitablePositions.add(this.calculateSuitablePosition(new BallPlayingDefenderCoDC(this)));
    suitablePositions.add(this.calculateSuitablePosition(new BallPlayingDefenderDeDC(this)));
    suitablePositions.add(this.calculateSuitablePosition(new BallPlayingDefenderStDC(this)));
    suitablePositions.add(this.calculateSuitablePosition(new BallWinningMidfielderDeDM(this)));
    suitablePositions.add(this.calculateSuitablePosition(new BallWinningMidfielderDeMC(this)));
    suitablePositions.add(this.calculateSuitablePosition(new BallWinningMidfielderSuDM(this)));
    suitablePositions.add(this.calculateSuitablePosition(new BallWinningMidfielderSuMC(this)));
    suitablePositions.add(this.calculateSuitablePosition(new BoxToBoxMidfielderSuMC(this)));
    suitablePositions.add(this.calculateSuitablePosition(new CarrileroSuMC(this)));
    suitablePositions.add(this.calculateSuitablePosition(new CentralDefenderCoDC(this)));
    suitablePositions.add(this.calculateSuitablePosition(new CentralDefenderDeDC(this)));
    suitablePositions.add(this.calculateSuitablePosition(new CentralDefenderStDC(this)));
    suitablePositions.add(this.calculateSuitablePosition(new CentralMidfielderAtMC(this)));
    suitablePositions.add(this.calculateSuitablePosition(new CentralMidfielderDeMC(this)));
    suitablePositions.add(this.calculateSuitablePosition(new CentralMidfielderSuMC(this)));
    suitablePositions.add(this.calculateSuitablePosition(new CompleteForwardAtSC(this)));
    suitablePositions.add(this.calculateSuitablePosition(new CompleteForwardSuSC(this)));
    suitablePositions.add(this.calculateSuitablePosition(new CompleteWingBackAtDRL(this)));
    suitablePositions.add(this.calculateSuitablePosition(new CompleteWingBackAtWBRL(this)));
    suitablePositions.add(this.calculateSuitablePosition(new CompleteWingBackSuDRL(this)));
    suitablePositions.add(this.calculateSuitablePosition(new CompleteWingBackSuWBRL(this)));
    suitablePositions.add(this.calculateSuitablePosition(new DeepLyingForwardAtSC(this)));
    suitablePositions.add(this.calculateSuitablePosition(new DeepLyingForwardSuSC(this)));
    suitablePositions.add(this.calculateSuitablePosition(new DeepLyingPlaymakerDeDM(this)));
    suitablePositions.add(this.calculateSuitablePosition(new DeepLyingPlaymakerDeMC(this)));
    suitablePositions.add(this.calculateSuitablePosition(new DeepLyingPlaymakerSuDM(this)));
    suitablePositions.add(this.calculateSuitablePosition(new DeepLyingPlaymakerSuMC(this)));
    suitablePositions.add(this.calculateSuitablePosition(new DefensiveMidfielderDeDM(this)));
    suitablePositions.add(this.calculateSuitablePosition(new DefensiveMidfielderSuDM(this)));
    suitablePositions.add(this.calculateSuitablePosition(new DefensiveWingerDeMRL(this)));
    suitablePositions.add(this.calculateSuitablePosition(new DefensiveWingerSuMRL(this)));
    suitablePositions.add(this.calculateSuitablePosition(new EngancheSuAMC(this)));
    suitablePositions.add(this.calculateSuitablePosition(new FalseNineSuSC(this)));
    suitablePositions.add(this.calculateSuitablePosition(new FullBackAtDRL(this)));
    suitablePositions.add(this.calculateSuitablePosition(new FullBackAuDRL(this)));
    suitablePositions.add(this.calculateSuitablePosition(new FullBackSuDRL(this)));
    suitablePositions.add(this.calculateSuitablePosition(new FullBackDeDRL(this)));
    suitablePositions.add(this.calculateSuitablePosition(new HalfBackDeDM(this)));
    suitablePositions.add(this.calculateSuitablePosition(new InsideForwardAtAMRL(this)));
    suitablePositions.add(this.calculateSuitablePosition(new InsideForwardSuAMRL(this)));
    suitablePositions.add(this.calculateSuitablePosition(new InvertedWingBackAtDRL(this)));
    suitablePositions.add(this.calculateSuitablePosition(new InvertedWingBackAtWBRL(this)));
    suitablePositions.add(this.calculateSuitablePosition(new InvertedWingBackAuDRL(this)));
    suitablePositions.add(this.calculateSuitablePosition(new InvertedWingBackDeDRL(this)));
    suitablePositions.add(this.calculateSuitablePosition(new InvertedWingBackDeWBRL(this)));
    suitablePositions.add(this.calculateSuitablePosition(new InvertedWingBackSuDRL(this)));
    suitablePositions.add(this.calculateSuitablePosition(new InvertedWingBackSuWBRL(this)));
    suitablePositions.add(this.calculateSuitablePosition(new InvertedWingerAtAMRL(this)));
    suitablePositions.add(this.calculateSuitablePosition(new InvertedWingerAtMRL(this)));
    suitablePositions.add(this.calculateSuitablePosition(new InvertedWingerSuAMRL(this)));
    suitablePositions.add(this.calculateSuitablePosition(new InvertedWingerSuMRL(this)));
    suitablePositions.add(this.calculateSuitablePosition(new LiberoSuDC(this)));
    suitablePositions.add(this.calculateSuitablePosition(new MezzalaAtMC(this)));
    suitablePositions.add(this.calculateSuitablePosition(new MezzalaSuMC(this)));
    suitablePositions.add(this.calculateSuitablePosition(new NoNonsenseCentreBackCoDC(this)));
    suitablePositions.add(this.calculateSuitablePosition(new NoNonsenseCentreBackDeDC(this)));
    suitablePositions.add(this.calculateSuitablePosition(new NoNonsenseCentreBackStDC(this)));
    suitablePositions.add(this.calculateSuitablePosition(new NoNonsenseFullBackDeDRL(this)));
    suitablePositions.add(this.calculateSuitablePosition(new PoacherAtSC(this)));
    suitablePositions.add(this.calculateSuitablePosition(new PressingForwardAtSC(this)));
    suitablePositions.add(this.calculateSuitablePosition(new PressingForwardDeSC(this)));
    suitablePositions.add(this.calculateSuitablePosition(new PressingForwardSuSC(this)));
    suitablePositions.add(this.calculateSuitablePosition(new RaumdeuterAtAMRL(this)));
    suitablePositions.add(this.calculateSuitablePosition(new RegistaSuDM(this)));
    suitablePositions.add(this.calculateSuitablePosition(new RoamingPlaymakerSuDM(this)));
    suitablePositions.add(this.calculateSuitablePosition(new RoamingPlaymakerSuMC(this)));
    suitablePositions.add(this.calculateSuitablePosition(new SegundoVolanteAtDM(this)));
    suitablePositions.add(this.calculateSuitablePosition(new SegundoVolanteSuDM(this)));
    suitablePositions.add(this.calculateSuitablePosition(new ShadowStrikerAtAMC(this)));
    suitablePositions.add(this.calculateSuitablePosition(new TargetForwardAtSC(this)));
    suitablePositions.add(this.calculateSuitablePosition(new TargetForwardSuSC(this)));
    suitablePositions.add(this.calculateSuitablePosition(new TrequartistaAtAMC(this)));
    suitablePositions.add(this.calculateSuitablePosition(new TrequartistaAtAMRL(this)));
    suitablePositions.add(this.calculateSuitablePosition(new TrequartistaAtSC(this)));
    suitablePositions.add(this.calculateSuitablePosition(new WideCentreBackAtDC(this)));
    suitablePositions.add(this.calculateSuitablePosition(new WideCentreBackDeDC(this)));
    suitablePositions.add(this.calculateSuitablePosition(new WideCentreBackSuDC(this)));
    suitablePositions.add(this.calculateSuitablePosition(new WideMidfielderAtMRL(this)));
    suitablePositions.add(this.calculateSuitablePosition(new WideMidfielderDeMRL(this)));
    suitablePositions.add(this.calculateSuitablePosition(new WideMidfielderSuMRL(this)));
    suitablePositions.add(this.calculateSuitablePosition(new WidePlaymakerAtMRL(this)));
    suitablePositions.add(this.calculateSuitablePosition(new WidePlaymakerSuMRL(this)));
    suitablePositions.add(this.calculateSuitablePosition(new WideTargetForwardAtAMRL(this)));
    suitablePositions.add(this.calculateSuitablePosition(new WideTargetForwardSuAMRL(this)));
    suitablePositions.add(this.calculateSuitablePosition(new WingBackAtDRL(this)));
    suitablePositions.add(this.calculateSuitablePosition(new WingBackAtWBRL(this)));
    suitablePositions.add(this.calculateSuitablePosition(new WingBackAuWBRL(this)));
    suitablePositions.add(this.calculateSuitablePosition(new WingBackDeDRL(this)));
    suitablePositions.add(this.calculateSuitablePosition(new WingBackDeWBRL(this)));
    suitablePositions.add(this.calculateSuitablePosition(new WingBackSuDRL(this)));
    suitablePositions.add(this.calculateSuitablePosition(new WingBackSuWBRL(this)));
    suitablePositions.add(this.calculateSuitablePosition(new WingerAtAMRL(this)));
    suitablePositions.add(this.calculateSuitablePosition(new WingerAtMRL(this)));
    suitablePositions.add(this.calculateSuitablePosition(new WingerSuAMRL(this)));
    suitablePositions.add(this.calculateSuitablePosition(new WingerSuMRL(this)));
    suitablePositions.add(this.calculateSuitablePosition(new LiberoAtDC(this)));

    return suitablePositions;
  }

  public int getCorners() {
    return corners;
  }

  public int getCrossing() {
    return crossing;
  }

  public int getDribbling() {
    return dribbling;
  }

  public int getFinishing() {
    return finishing;
  }

  public int getHeading() {
    return heading;
  }

  public int getLongShots() {
    return longShots;
  }

  public int getLongThrows() {
    return longThrows;
  }

  public int getMarking() {
    return marking;
  }

  public int getTackling() {
    return tackling;
  }

  @Override
  public String toString() {
    return "LinePlayer [aggression="
        + aggression
        + ", anticipation="
        + anticipation
        + ", bravery="
        + bravery
        + ", composure="
        + composure
        + ", concentration="
        + concentration
        + ", decisions="
        + decisions
        + ", determination="
        + determination
        + ", flair="
        + flair
        + ", leadership="
        + leadership
        + ", offTheBall="
        + offTheBall
        + ", positioning="
        + positioning
        + ", teamwork="
        + teamwork
        + ", vision="
        + vision
        + ", workRate="
        + workRate
        + ", acceleration="
        + acceleration
        + ", agility="
        + agility
        + ", balance="
        + balance
        + ", jumpingReach="
        + jumpingReach
        + ", naturalFitness="
        + naturalFitness
        + ", pace="
        + pace
        + ", stamina="
        + stamina
        + ", strength="
        + strength
        + ", freeKickTaking="
        + freeKickTaking
        + ", penaltyTaking="
        + penaltyTaking
        + ", technique="
        + technique
        + ", firstTouch="
        + firstTouch
        + ", passing="
        + passing
        + ", corners="
        + corners
        + ", crossing="
        + crossing
        + ", dribbling="
        + dribbling
        + ", finishing="
        + finishing
        + ", heading="
        + heading
        + ", longShots="
        + longShots
        + ", longThrows="
        + longThrows
        + ", marking="
        + marking
        + ", tackling="
        + tackling;
  }

  public void setCorners(int corners) {
    this.corners = corners;
  }

  public void setCrossing(int crossing) {
    this.crossing = crossing;
  }

  public void setDribbling(int dribbling) {
    this.dribbling = dribbling;
  }

  public void setFinishing(int finishing) {
    this.finishing = finishing;
  }

  public void setHeading(int heading) {
    this.heading = heading;
  }

  public void setLongShots(int longShots) {
    this.longShots = longShots;
  }

  public void setLongThrows(int longThrows) {
    this.longThrows = longThrows;
  }

  public void setMarking(int marking) {
    this.marking = marking;
  }

  public void setTackling(int tackling) {
    this.tackling = tackling;
  }
}
