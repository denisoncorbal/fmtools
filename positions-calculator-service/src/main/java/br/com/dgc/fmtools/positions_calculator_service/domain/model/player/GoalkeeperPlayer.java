package br.com.dgc.fmtools.positions_calculator_service.domain.model.player;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.SuitablePosition;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.goalkeeper.GoalkeeperDeGK;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.goalkeeper.SweeperKeeperAtGK;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.goalkeeper.SweeperKeeperDeGK;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.goalkeeper.SweeperKeeperSuGK;
import java.util.ArrayList;
import java.util.List;

public class GoalkeeperPlayer extends Player {

  public void setAerialReach(int aerialReach) {
    this.aerialReach = aerialReach;
  }

  public void setCommandOfArea(int commandOfArea) {
    this.commandOfArea = commandOfArea;
  }

  public void setCommunication(int communication) {
    this.communication = communication;
  }

  public void setEccentricity(int eccentricity) {
    this.eccentricity = eccentricity;
  }

  public void setHandling(int handling) {
    this.handling = handling;
  }

  public void setKicking(int kicking) {
    this.kicking = kicking;
  }

  public void setOneOnOnes(int oneOnOnes) {
    this.oneOnOnes = oneOnOnes;
  }

  public void setPunching(int punching) {
    this.punching = punching;
  }

  public void setReflexes(int reflexes) {
    this.reflexes = reflexes;
  }

  public void setRushingOut(int rushingOut) {
    this.rushingOut = rushingOut;
  }

  public void setThrowing(int throwing) {
    this.throwing = throwing;
  }

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

  public GoalkeeperPlayer() {
    super();
  }

  public GoalkeeperPlayer(
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

  public GoalkeeperPlayer(GoalkeeperPlayer initPlayer) {
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
    this.aerialReach = initPlayer.aerialReach;
    this.commandOfArea = initPlayer.commandOfArea;
    this.communication = initPlayer.communication;
    this.eccentricity = initPlayer.eccentricity;
    this.handling = initPlayer.handling;
    this.kicking = initPlayer.kicking;
    this.oneOnOnes = initPlayer.oneOnOnes;
    this.punching = initPlayer.punching;
    this.reflexes = initPlayer.reflexes;
    this.rushingOut = initPlayer.rushingOut;
    this.throwing = initPlayer.throwing;
  }

  @Override
  public List<SuitablePosition> calculateSuitablePositions() {
    List<SuitablePosition> suitablePositions = new ArrayList<>();

    suitablePositions.add(this.calculateSuitablePosition(new SweeperKeeperDeGK(this)));
    suitablePositions.add(this.calculateSuitablePosition(new SweeperKeeperSuGK(this)));
    suitablePositions.add(this.calculateSuitablePosition(new SweeperKeeperAtGK(this)));
    suitablePositions.add(this.calculateSuitablePosition(new GoalkeeperDeGK(this)));

    return suitablePositions;
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
