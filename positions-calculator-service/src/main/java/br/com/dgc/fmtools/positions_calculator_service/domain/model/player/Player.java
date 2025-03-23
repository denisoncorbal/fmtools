package br.com.dgc.fmtools.positions_calculator_service.domain.model.player;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.Position;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.SuitablePosition;
import java.util.List;

public abstract class Player {

  protected String name;
  protected int aggression;
  protected int anticipation;
  protected int bravery;
  protected int composure;
  protected int concentration;
  protected int decisions;
  protected int determination;
  protected int flair;
  protected int leadership;
  protected int offTheBall;
  protected int positioning;
  protected int teamwork;
  protected int vision;
  protected int workRate;
  protected int acceleration;
  protected int agility;
  protected int balance;
  protected int jumpingReach;
  protected int naturalFitness;
  protected int pace;
  protected int stamina;
  protected int strength;
  protected int freeKickTaking;
  protected int penaltyTaking;
  protected int technique;
  protected int firstTouch;
  protected int passing;

  public Player() {}

  public Player(
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
      int passing) {
    this.name = name;
    this.aggression = aggression;
    this.anticipation = anticipation;
    this.bravery = bravery;
    this.composure = composure;
    this.concentration = concentration;
    this.decisions = decisions;
    this.determination = determination;
    this.flair = flair;
    this.leadership = leadership;
    this.offTheBall = offTheBall;
    this.positioning = positioning;
    this.teamwork = teamwork;
    this.vision = vision;
    this.workRate = workRate;
    this.acceleration = acceleration;
    this.agility = agility;
    this.balance = balance;
    this.jumpingReach = jumpingReach;
    this.naturalFitness = naturalFitness;
    this.pace = pace;
    this.stamina = stamina;
    this.strength = strength;
    this.freeKickTaking = freeKickTaking;
    this.penaltyTaking = penaltyTaking;
    this.technique = technique;
    this.firstTouch = firstTouch;
    this.passing = passing;
  }

  public abstract List<SuitablePosition> calculateSuitablePositions();

  protected SuitablePosition calculateSuitablePosition(Position position) {
    int sumPreferableAttributes =
        position.getPreferableAttributes().stream().reduce(0, Integer::sum);
    int sumKeyAttributes = position.getKeyAttributes().stream().reduce(0, Integer::sum);

    int totalAttributes = sumPreferableAttributes + sumKeyAttributes;

    double suitableValue = totalAttributes / position.getWeight();

    double percentageSuitable = suitableValue * 100 / 20;

    return new SuitablePosition(
        position.getName(),
        percentageSuitable,
        position.getKeyAttributes().size(),
        position.getPreferableAttributes().size());
  }

  public String getName() {
    return name;
  }

  public int getAggression() {
    return aggression;
  }

  public int getAnticipation() {
    return anticipation;
  }

  public int getBravery() {
    return bravery;
  }

  public int getComposure() {
    return composure;
  }

  public int getConcentration() {
    return concentration;
  }

  public int getDecisions() {
    return decisions;
  }

  public int getDetermination() {
    return determination;
  }

  public int getFlair() {
    return flair;
  }

  public int getLeadership() {
    return leadership;
  }

  public int getOffTheBall() {
    return offTheBall;
  }

  public int getPositioning() {
    return positioning;
  }

  public int getTeamwork() {
    return teamwork;
  }

  public int getVision() {
    return vision;
  }

  public int getWorkRate() {
    return workRate;
  }

  public int getAcceleration() {
    return acceleration;
  }

  public int getAgility() {
    return agility;
  }

  public int getBalance() {
    return balance;
  }

  public int getJumpingReach() {
    return jumpingReach;
  }

  public int getNaturalFitness() {
    return naturalFitness;
  }

  public int getPace() {
    return pace;
  }

  public int getStamina() {
    return stamina;
  }

  public int getStrength() {
    return strength;
  }

  public int getFreeKickTaking() {
    return freeKickTaking;
  }

  public int getPenaltyTaking() {
    return penaltyTaking;
  }

  public int getTechnique() {
    return technique;
  }

  public int getFirstTouch() {
    return firstTouch;
  }

  public int getPassing() {
    return passing;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAggression(int aggression) {
    this.aggression = aggression;
  }

  public void setAnticipation(int anticipation) {
    this.anticipation = anticipation;
  }

  public void setBravery(int bravery) {
    this.bravery = bravery;
  }

  public void setComposure(int composure) {
    this.composure = composure;
  }

  public void setConcentration(int concentration) {
    this.concentration = concentration;
  }

  public void setDecisions(int decisions) {
    this.decisions = decisions;
  }

  public void setDetermination(int determination) {
    this.determination = determination;
  }

  public void setFlair(int flair) {
    this.flair = flair;
  }

  public void setLeadership(int leadership) {
    this.leadership = leadership;
  }

  public void setOffTheBall(int offTheBall) {
    this.offTheBall = offTheBall;
  }

  public void setPositioning(int positioning) {
    this.positioning = positioning;
  }

  public void setTeamwork(int teamwork) {
    this.teamwork = teamwork;
  }

  public void setVision(int vision) {
    this.vision = vision;
  }

  public void setWorkRate(int workRate) {
    this.workRate = workRate;
  }

  public void setAcceleration(int acceleration) {
    this.acceleration = acceleration;
  }

  public void setAgility(int agility) {
    this.agility = agility;
  }

  public void setBalance(int balance) {
    this.balance = balance;
  }

  public void setJumpingReach(int jumpingReach) {
    this.jumpingReach = jumpingReach;
  }

  public void setNaturalFitness(int naturalFitness) {
    this.naturalFitness = naturalFitness;
  }

  public void setPace(int pace) {
    this.pace = pace;
  }

  public void setStamina(int stamina) {
    this.stamina = stamina;
  }

  public void setStrength(int strength) {
    this.strength = strength;
  }

  public void setFreeKickTaking(int freeKickTaking) {
    this.freeKickTaking = freeKickTaking;
  }

  public void setPenaltyTaking(int penaltyTaking) {
    this.penaltyTaking = penaltyTaking;
  }

  public void setTechnique(int technique) {
    this.technique = technique;
  }

  public void setFirstTouch(int firstTouch) {
    this.firstTouch = firstTouch;
  }

  public void setPassing(int passing) {
    this.passing = passing;
  }
}
