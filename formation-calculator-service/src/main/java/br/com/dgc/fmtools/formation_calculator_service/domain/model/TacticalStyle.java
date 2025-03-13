package br.com.dgc.fmtools.formation_calculator_service.domain.model;

import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class TacticalStyle {
  String name;
  String mentality;
  List<Formation> preferableFormations = new ArrayList<Formation>(3);

  private Logger log = LoggerFactory.getLogger(TacticalStyle.class);

  public TacticalStyle(String name, String mentality, List<Formation> preferableFormations) {
    this.name = name;
    this.mentality = mentality;
    this.preferableFormations = preferableFormations;
  }

  public void calculateFormations(
      List<Position> linePlayerPositions, List<Position> goalkeeperPlayerPositions) {
    log.info("Calculate formations for: " + this.name);
    preferableFormations.forEach(
        (formation) -> {
          formation.calculateBetterFormation(linePlayerPositions, goalkeeperPlayerPositions);
          formation.calculatePercentage();
        });
  }

  public String getName() {
    return name;
  }

  public String getMentality() {
    return mentality;
  }

  public List<Formation> getPreferableFormations() {
    return preferableFormations;
  }
}
