package br.com.dgc.fmtools.squad_manager.domain.repository.dao;

import br.com.dgc.fmtools.squad_manager.domain.repository.UuidPostgresqlGeneratorAnnotation;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "TB_LINE_PLAYER")
public class LinePlayerEntity {
  @Id @UuidPostgresqlGeneratorAnnotation private UUID id;

  private String name;

  private int aggression;

  private int anticipation;

  private int bravery;

  private int composure;

  private int concentration;

  private int decisions;

  private int determination;

  private int flair;

  private int leadership;

  private int offTheBall;

  private int positioning;

  private int teamwork;

  private int vision;

  private int workRate;

  private int acceleration;

  private int agility;

  private int balance;

  private int jumpingReach;

  private int naturalFitness;

  private int pace;

  private int stamina;

  private int strength;

  private int freeKickTaking;

  private int penaltyTaking;

  private int technique;

  private int firstTouch;

  private int passing;

  private int corners;

  private int crossing;

  private int dribbling;

  private int finishing;

  private int heading;

  private int longShots;

  private int longThrows;

  private int marking;

  private int tackling;

  public LinePlayerEntity() {}

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
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
