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
        position.getPreferableAttributes().stream()
            .reduce(0, (acumulator, element) -> acumulator += element);
    int sumKeyAttributes =
        position.getKeyAttributes().stream()
            .reduce(0, (acumulator, element) -> acumulator += element * 2);
    int total = sumPreferableAttributes + sumKeyAttributes;
    int totalPeso =
        position.getPreferableAttributes().size() + (position.getKeyAttributes().size() * 2);

    int maxAttributesSum =
        (position.getPreferableAttributes().size() * 20)
            + (position.getKeyAttributes().size() * 20 * 2);
    int maxAttributesValue = (int) (maxAttributesSum / totalPeso);

    int suitableValue = (int) (total / totalPeso);
    int percentageSuitable = (int) (suitableValue * 100 / maxAttributesValue);
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
}
