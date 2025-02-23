package br.com.dgc.fmtools.squad_manager.web.dto.request;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class LinePlayerRequest {
  @NotEmpty @NotBlank @Size(min = 3, max = 50) private String name;

  @NotNull @Min(1) @Max(20) private int aggression;

  @NotNull @Min(1) @Max(20) private int anticipation;

  @NotNull @Min(1) @Max(20) private int bravery;

  @NotNull @Min(1) @Max(20) private int composure;

  @NotNull @Min(1) @Max(20) private int concentration;

  @NotNull @Min(1) @Max(20) private int decisions;

  @NotNull @Min(1) @Max(20) private int determination;

  @NotNull @Min(1) @Max(20) private int flair;

  @NotNull @Min(1) @Max(20) private int leadership;

  @NotNull @Min(1) @Max(20) private int offTheBall;

  @NotNull @Min(1) @Max(20) private int positioning;

  @NotNull @Min(1) @Max(20) private int teamwork;

  @NotNull @Min(1) @Max(20) private int vision;

  @NotNull @Min(1) @Max(20) private int workRate;

  @NotNull @Min(1) @Max(20) private int acceleration;

  @NotNull @Min(1) @Max(20) private int agility;

  @NotNull @Min(1) @Max(20) private int balance;

  @NotNull @Min(1) @Max(20) private int jumpingReach;

  @NotNull @Min(1) @Max(20) private int naturalFitness;

  @NotNull @Min(1) @Max(20) private int pace;

  @NotNull @Min(1) @Max(20) private int stamina;

  @NotNull @Min(1) @Max(20) private int strength;

  @NotNull @Min(1) @Max(20) private int freeKickTaking;

  @NotNull @Min(1) @Max(20) private int penaltyTaking;

  @NotNull @Min(1) @Max(20) private int technique;

  @NotNull @Min(1) @Max(20) private int firstTouch;

  @NotNull @Min(1) @Max(20) private int passing;

  @NotNull @Min(1) @Max(20) private int corners;

  @NotNull @Min(1) @Max(20) private int crossing;

  @NotNull @Min(1) @Max(20) private int dribbling;

  @NotNull @Min(1) @Max(20) private int finishing;

  @NotNull @Min(1) @Max(20) private int heading;

  @NotNull @Min(1) @Max(20) private int longShots;

  @NotNull @Min(1) @Max(20) private int longThrows;

  @NotNull @Min(1) @Max(20) private int marking;

  @NotNull @Min(1) @Max(20) private int tackling;

  public LinePlayerRequest(
      @NotEmpty @NotBlank @Size(min = 3, max = 50) String name,
      @NotNull @Min(1) @Max(20) int aggression,
      @NotNull @Min(1) @Max(20) int anticipation,
      @NotNull @Min(1) @Max(20) int bravery,
      @NotNull @Min(1) @Max(20) int composure,
      @NotNull @Min(1) @Max(20) int concentration,
      @NotNull @Min(1) @Max(20) int decisions,
      @NotNull @Min(1) @Max(20) int determination,
      @NotNull @Min(1) @Max(20) int flair,
      @NotNull @Min(1) @Max(20) int leadership,
      @NotNull @Min(1) @Max(20) int offTheBall,
      @NotNull @Min(1) @Max(20) int positioning,
      @NotNull @Min(1) @Max(20) int teamwork,
      @NotNull @Min(1) @Max(20) int vision,
      @NotNull @Min(1) @Max(20) int workRate,
      @NotNull @Min(1) @Max(20) int acceleration,
      @NotNull @Min(1) @Max(20) int agility,
      @NotNull @Min(1) @Max(20) int balance,
      @NotNull @Min(1) @Max(20) int jumpingReach,
      @NotNull @Min(1) @Max(20) int naturalFitness,
      @NotNull @Min(1) @Max(20) int pace,
      @NotNull @Min(1) @Max(20) int stamina,
      @NotNull @Min(1) @Max(20) int strength,
      @NotNull @Min(1) @Max(20) int freeKickTaking,
      @NotNull @Min(1) @Max(20) int penaltyTaking,
      @NotNull @Min(1) @Max(20) int technique,
      @NotNull @Min(1) @Max(20) int firstTouch,
      @NotNull @Min(1) @Max(20) int passing,
      @NotNull @Min(1) @Max(20) int corners,
      @NotNull @Min(1) @Max(20) int crossing,
      @NotNull @Min(1) @Max(20) int dribbling,
      @NotNull @Min(1) @Max(20) int finishing,
      @NotNull @Min(1) @Max(20) int heading,
      @NotNull @Min(1) @Max(20) int longShots,
      @NotNull @Min(1) @Max(20) int longThrows,
      @NotNull @Min(1) @Max(20) int marking,
      @NotNull @Min(1) @Max(20) int tackling) {
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

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAggression() {
    return aggression;
  }

  public void setAggression(int aggression) {
    this.aggression = aggression;
  }

  public int getAnticipation() {
    return anticipation;
  }

  public void setAnticipation(int anticipation) {
    this.anticipation = anticipation;
  }

  public int getBravery() {
    return bravery;
  }

  public void setBravery(int bravery) {
    this.bravery = bravery;
  }

  public int getComposure() {
    return composure;
  }

  public void setComposure(int composure) {
    this.composure = composure;
  }

  public int getConcentration() {
    return concentration;
  }

  public void setConcentration(int concentration) {
    this.concentration = concentration;
  }

  public int getDecisions() {
    return decisions;
  }

  public void setDecisions(int decisions) {
    this.decisions = decisions;
  }

  public int getDetermination() {
    return determination;
  }

  public void setDetermination(int determination) {
    this.determination = determination;
  }

  public int getFlair() {
    return flair;
  }

  public void setFlair(int flair) {
    this.flair = flair;
  }

  public int getLeadership() {
    return leadership;
  }

  public void setLeadership(int leadership) {
    this.leadership = leadership;
  }

  public int getOffTheBall() {
    return offTheBall;
  }

  public void setOffTheBall(int offTheBall) {
    this.offTheBall = offTheBall;
  }

  public int getPositioning() {
    return positioning;
  }

  public void setPositioning(int positioning) {
    this.positioning = positioning;
  }

  public int getTeamwork() {
    return teamwork;
  }

  public void setTeamwork(int teamwork) {
    this.teamwork = teamwork;
  }

  public int getVision() {
    return vision;
  }

  public void setVision(int vision) {
    this.vision = vision;
  }

  public int getWorkRate() {
    return workRate;
  }

  public void setWorkRate(int workRate) {
    this.workRate = workRate;
  }

  public int getAcceleration() {
    return acceleration;
  }

  public void setAcceleration(int acceleration) {
    this.acceleration = acceleration;
  }

  public int getAgility() {
    return agility;
  }

  public void setAgility(int agility) {
    this.agility = agility;
  }

  public int getBalance() {
    return balance;
  }

  public void setBalance(int balance) {
    this.balance = balance;
  }

  public int getJumpingReach() {
    return jumpingReach;
  }

  public void setJumpingReach(int jumpingReach) {
    this.jumpingReach = jumpingReach;
  }

  public int getNaturalFitness() {
    return naturalFitness;
  }

  public void setNaturalFitness(int naturalFitness) {
    this.naturalFitness = naturalFitness;
  }

  public int getPace() {
    return pace;
  }

  public void setPace(int pace) {
    this.pace = pace;
  }

  public int getStamina() {
    return stamina;
  }

  public void setStamina(int stamina) {
    this.stamina = stamina;
  }

  public int getStrength() {
    return strength;
  }

  public void setStrength(int strength) {
    this.strength = strength;
  }

  public int getFreeKickTaking() {
    return freeKickTaking;
  }

  public void setFreeKickTaking(int freeKickTaking) {
    this.freeKickTaking = freeKickTaking;
  }

  public int getPenaltyTaking() {
    return penaltyTaking;
  }

  public void setPenaltyTaking(int penaltyTaking) {
    this.penaltyTaking = penaltyTaking;
  }

  public int getTechnique() {
    return technique;
  }

  public void setTechnique(int technique) {
    this.technique = technique;
  }

  public int getFirstTouch() {
    return firstTouch;
  }

  public void setFirstTouch(int firstTouch) {
    this.firstTouch = firstTouch;
  }

  public int getPassing() {
    return passing;
  }

  public void setPassing(int passing) {
    this.passing = passing;
  }

  public int getCorners() {
    return corners;
  }

  public void setCorners(int corners) {
    this.corners = corners;
  }

  public int getCrossing() {
    return crossing;
  }

  public void setCrossing(int crossing) {
    this.crossing = crossing;
  }

  public int getDribbling() {
    return dribbling;
  }

  public void setDribbling(int dribbling) {
    this.dribbling = dribbling;
  }

  public int getFinishing() {
    return finishing;
  }

  public void setFinishing(int finishing) {
    this.finishing = finishing;
  }

  public int getHeading() {
    return heading;
  }

  public void setHeading(int heading) {
    this.heading = heading;
  }

  public int getLongShots() {
    return longShots;
  }

  public void setLongShots(int longShots) {
    this.longShots = longShots;
  }

  public int getLongThrows() {
    return longThrows;
  }

  public void setLongThrows(int longThrows) {
    this.longThrows = longThrows;
  }

  public int getMarking() {
    return marking;
  }

  public void setMarking(int marking) {
    this.marking = marking;
  }

  public int getTackling() {
    return tackling;
  }

  public void setTackling(int tackling) {
    this.tackling = tackling;
  }
}
