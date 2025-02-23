package br.com.dgc.fmtools.squad_manager.domain.player;

public class GoalkeeperPlayer extends Player {
  private int aerialReach;
  private int commandOfArea;
  private int communication;
  private int eccentricity;
  private int handling;
  private int kicking;
  private int oneOnOnes;
  private int punching;
  private int reflexes;
  private int rushingOut;
  private int throwing;

  public GoalkeeperPlayer(
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
      int aerialReach,
      int commandOfArea,
      int communication,
      int eccentricity,
      int handling,
      int kicking,
      int oneOnOnes,
      int punching,
      int reflexes,
      int rushingOut,
      int throwing) {
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
    this.aerialReach = aerialReach;
    this.commandOfArea = commandOfArea;
    this.communication = communication;
    this.eccentricity = eccentricity;
    this.handling = handling;
    this.kicking = kicking;
    this.oneOnOnes = oneOnOnes;
    this.punching = punching;
    this.reflexes = reflexes;
    this.rushingOut = rushingOut;
    this.throwing = throwing;
  }

  public int getAerialReach() {
    return aerialReach;
  }

  public int getCommandOfArea() {
    return commandOfArea;
  }

  public int getCommunication() {
    return communication;
  }

  public int getEccentricity() {
    return eccentricity;
  }

  public int getHandling() {
    return handling;
  }

  public int getKicking() {
    return kicking;
  }

  public int getOneOnOnes() {
    return oneOnOnes;
  }

  public int getPunching() {
    return punching;
  }

  public int getReflexes() {
    return reflexes;
  }

  public int getRushingOut() {
    return rushingOut;
  }

  public int getThrowing() {
    return throwing;
  }

  @Override
  public String toString() {
    return "GoalkeeperPlayer [aggression="
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
        + ", aerialReach="
        + aerialReach
        + ", commandOfArea="
        + commandOfArea
        + ", positioning="
        + positioning
        + ", communication="
        + communication
        + ", teamwork="
        + teamwork
        + ", vision="
        + vision
        + ", eccentricity="
        + eccentricity
        + ", workRate="
        + workRate
        + ", handling="
        + handling
        + ", acceleration="
        + acceleration
        + ", kicking="
        + kicking
        + ", oneOnOnes="
        + oneOnOnes
        + ", agility="
        + agility
        + ", punching="
        + punching
        + ", balance="
        + balance
        + ", reflexes="
        + reflexes
        + ", jumpingReach="
        + jumpingReach
        + ", rushingOut="
        + rushingOut
        + ", naturalFitness="
        + naturalFitness
        + ", throwing="
        + throwing
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
        + passing;
  }
}
