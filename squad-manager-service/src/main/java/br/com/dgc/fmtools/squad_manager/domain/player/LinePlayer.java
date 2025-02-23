package br.com.dgc.fmtools.squad_manager.domain.player;

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

  public LinePlayer(
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
