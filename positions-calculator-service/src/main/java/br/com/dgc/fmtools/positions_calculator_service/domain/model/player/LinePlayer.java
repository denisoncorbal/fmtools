package br.com.dgc.fmtools.positions_calculator_service.domain.model.player;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.AdvancedForwardAt;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.AdvancedPlaymakerAt;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.AdvancedPlaymakerSu;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.AnchorDe;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.AttackingMidfielderAt;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.AttackingMidfielderSu;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.BallPlayingDefenderCo;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.BallPlayingDefenderDe;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.BallPlayingDefenderSt;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.BallWinningMidfielderDe;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.BallWinningMidfielderSu;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.BoxToBoxMidfielderSu;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.CarrileroSu;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.CentralDefenderCo;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.CentralDefenderDe;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.CentralDefenderSt;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.CentralMidfielderAt;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.CentralMidfielderDe;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.CentralMidfielderSu;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.CompleteForwardAt;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.CompleteForwardSu;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.CompleteWingBackAt;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.CompleteWingBackSu;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.DeepLyingForwardAt;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.DeepLyingForwardSu;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.DeepLyingPlaymakerDe;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.DeepLyingPlaymakerSu;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.DefensiveMidfielderDe;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.DefensiveMidfielderSu;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.DefensiveWingerDe;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.DefensiveWingerSu;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.EngancheSu;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.FalseNineSu;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.FullBackAt;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.FullBackAu;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.FullBackDe;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.FullBackSu;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.HalfBackDe;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.InsideForwardAt;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.InsideForwardSu;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.InvertedWingBackAt;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.InvertedWingBackAu;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.InvertedWingBackDe;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.InvertedWingBackSu;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.InvertedWingerAt;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.InvertedWingerSu;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.LiberoAt;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.LiberoSu;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.MezzalaAt;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.MezzalaSu;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.NoNonsenseCentreBackCo;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.NoNonsenseCentreBackDe;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.NoNonsenseCentreBackSt;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.NoNonsenseFullBackDe;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.PoacherAt;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.PressingForwardAt;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.PressingForwardDe;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.PressingForwardSu;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.RaumdeuterAt;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.RegistaSu;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.RoamingPlaymakerSu;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.SegundoVolanteAt;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.SegundoVolanteSu;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.ShadowStrikerAt;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.SuitablePosition;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.TargetForwardAt;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.TargetForwardSu;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.TrequartistaAt;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.WideCentreBackAt;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.WideCentreBackDe;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.WideCentreBackSu;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.WideMidfielderAt;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.WideMidfielderDe;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.WideMidfielderSu;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.WidePlaymakerAt;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.WidePlaymakerSu;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.WideTargetForwardAt;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.WideTargetForwardSu;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.WingBackAt;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.WingBackAu;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.WingBackDe;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.WingBackSu;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.WingerAt;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.WingerSu;
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

  @Override
  public List<SuitablePosition> calculateSuitablePositions() {
    List<SuitablePosition> suitablePositions = new ArrayList<>();

    suitablePositions.add(this.calculateSuitablePosition(new AdvancedForwardAt(this)));
    suitablePositions.add(this.calculateSuitablePosition(new AdvancedPlaymakerAt(this)));
    suitablePositions.add(this.calculateSuitablePosition(new AdvancedPlaymakerSu(this)));
    suitablePositions.add(this.calculateSuitablePosition(new AnchorDe(this)));
    suitablePositions.add(this.calculateSuitablePosition(new AttackingMidfielderAt(this)));
    suitablePositions.add(this.calculateSuitablePosition(new AttackingMidfielderSu(this)));
    suitablePositions.add(this.calculateSuitablePosition(new BallPlayingDefenderCo(this)));
    suitablePositions.add(this.calculateSuitablePosition(new BallPlayingDefenderDe(this)));
    suitablePositions.add(this.calculateSuitablePosition(new BallPlayingDefenderSt(this)));
    suitablePositions.add(this.calculateSuitablePosition(new BallWinningMidfielderDe(this)));
    suitablePositions.add(this.calculateSuitablePosition(new BallWinningMidfielderSu(this)));
    suitablePositions.add(this.calculateSuitablePosition(new BoxToBoxMidfielderSu(this)));
    suitablePositions.add(this.calculateSuitablePosition(new CarrileroSu(this)));
    suitablePositions.add(this.calculateSuitablePosition(new CentralDefenderCo(this)));
    suitablePositions.add(this.calculateSuitablePosition(new CentralDefenderDe(this)));
    suitablePositions.add(this.calculateSuitablePosition(new CentralDefenderSt(this)));
    suitablePositions.add(this.calculateSuitablePosition(new CentralMidfielderAt(this)));
    suitablePositions.add(this.calculateSuitablePosition(new CentralMidfielderDe(this)));
    suitablePositions.add(this.calculateSuitablePosition(new CentralMidfielderSu(this)));
    suitablePositions.add(this.calculateSuitablePosition(new CompleteForwardAt(this)));
    suitablePositions.add(this.calculateSuitablePosition(new CompleteForwardSu(this)));
    suitablePositions.add(this.calculateSuitablePosition(new CompleteWingBackAt(this)));
    suitablePositions.add(this.calculateSuitablePosition(new CompleteWingBackSu(this)));
    suitablePositions.add(this.calculateSuitablePosition(new DeepLyingForwardAt(this)));
    suitablePositions.add(this.calculateSuitablePosition(new DeepLyingForwardSu(this)));
    suitablePositions.add(this.calculateSuitablePosition(new DeepLyingPlaymakerDe(this)));
    suitablePositions.add(this.calculateSuitablePosition(new DeepLyingPlaymakerSu(this)));
    suitablePositions.add(this.calculateSuitablePosition(new DefensiveMidfielderDe(this)));
    suitablePositions.add(this.calculateSuitablePosition(new DefensiveMidfielderSu(this)));
    suitablePositions.add(this.calculateSuitablePosition(new DefensiveWingerDe(this)));
    suitablePositions.add(this.calculateSuitablePosition(new DefensiveWingerSu(this)));
    suitablePositions.add(this.calculateSuitablePosition(new EngancheSu(this)));
    suitablePositions.add(this.calculateSuitablePosition(new FalseNineSu(this)));
    suitablePositions.add(this.calculateSuitablePosition(new FullBackAt(this)));
    suitablePositions.add(this.calculateSuitablePosition(new FullBackAu(this)));
    suitablePositions.add(this.calculateSuitablePosition(new FullBackSu(this)));
    suitablePositions.add(this.calculateSuitablePosition(new FullBackDe(this)));
    suitablePositions.add(this.calculateSuitablePosition(new HalfBackDe(this)));
    suitablePositions.add(this.calculateSuitablePosition(new InsideForwardAt(this)));
    suitablePositions.add(this.calculateSuitablePosition(new InsideForwardSu(this)));
    suitablePositions.add(this.calculateSuitablePosition(new InvertedWingBackAt(this)));
    suitablePositions.add(this.calculateSuitablePosition(new InvertedWingBackAu(this)));
    suitablePositions.add(this.calculateSuitablePosition(new InvertedWingBackDe(this)));
    suitablePositions.add(this.calculateSuitablePosition(new InvertedWingBackSu(this)));
    suitablePositions.add(this.calculateSuitablePosition(new InvertedWingerAt(this)));
    suitablePositions.add(this.calculateSuitablePosition(new InvertedWingerSu(this)));
    suitablePositions.add(this.calculateSuitablePosition(new LiberoSu(this)));
    suitablePositions.add(this.calculateSuitablePosition(new MezzalaAt(this)));
    suitablePositions.add(this.calculateSuitablePosition(new MezzalaSu(this)));
    suitablePositions.add(this.calculateSuitablePosition(new NoNonsenseCentreBackCo(this)));
    suitablePositions.add(this.calculateSuitablePosition(new NoNonsenseCentreBackDe(this)));
    suitablePositions.add(this.calculateSuitablePosition(new NoNonsenseCentreBackSt(this)));
    suitablePositions.add(this.calculateSuitablePosition(new NoNonsenseFullBackDe(this)));
    suitablePositions.add(this.calculateSuitablePosition(new PoacherAt(this)));
    suitablePositions.add(this.calculateSuitablePosition(new PressingForwardAt(this)));
    suitablePositions.add(this.calculateSuitablePosition(new PressingForwardDe(this)));
    suitablePositions.add(this.calculateSuitablePosition(new PressingForwardSu(this)));
    suitablePositions.add(this.calculateSuitablePosition(new RaumdeuterAt(this)));
    suitablePositions.add(this.calculateSuitablePosition(new RegistaSu(this)));
    suitablePositions.add(this.calculateSuitablePosition(new RoamingPlaymakerSu(this)));
    suitablePositions.add(this.calculateSuitablePosition(new SegundoVolanteAt(this)));
    suitablePositions.add(this.calculateSuitablePosition(new SegundoVolanteSu(this)));
    suitablePositions.add(this.calculateSuitablePosition(new ShadowStrikerAt(this)));
    suitablePositions.add(this.calculateSuitablePosition(new TargetForwardAt(this)));
    suitablePositions.add(this.calculateSuitablePosition(new TargetForwardSu(this)));
    suitablePositions.add(this.calculateSuitablePosition(new TrequartistaAt(this)));
    suitablePositions.add(this.calculateSuitablePosition(new WideCentreBackAt(this)));
    suitablePositions.add(this.calculateSuitablePosition(new WideCentreBackDe(this)));
    suitablePositions.add(this.calculateSuitablePosition(new WideCentreBackSu(this)));
    suitablePositions.add(this.calculateSuitablePosition(new WideMidfielderAt(this)));
    suitablePositions.add(this.calculateSuitablePosition(new WideMidfielderDe(this)));
    suitablePositions.add(this.calculateSuitablePosition(new WideMidfielderSu(this)));
    suitablePositions.add(this.calculateSuitablePosition(new WidePlaymakerAt(this)));
    suitablePositions.add(this.calculateSuitablePosition(new WidePlaymakerSu(this)));
    suitablePositions.add(this.calculateSuitablePosition(new WideTargetForwardAt(this)));
    suitablePositions.add(this.calculateSuitablePosition(new WideTargetForwardSu(this)));
    suitablePositions.add(this.calculateSuitablePosition(new WingBackAt(this)));
    suitablePositions.add(this.calculateSuitablePosition(new WingBackAu(this)));
    suitablePositions.add(this.calculateSuitablePosition(new WingBackDe(this)));
    suitablePositions.add(this.calculateSuitablePosition(new WingBackSu(this)));
    suitablePositions.add(this.calculateSuitablePosition(new WingerAt(this)));
    suitablePositions.add(this.calculateSuitablePosition(new WingerSu(this)));
    suitablePositions.add(this.calculateSuitablePosition(new LiberoAt(this)));

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
}
