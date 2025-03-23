package br.com.dgc.fmtools.positions_calculator_service.domain.model.position;

import java.util.List;

public abstract class Position {

  protected String name;
  protected List<Integer> preferableAttributes;
  protected List<Integer> keyAttributes;
  protected int weight;

  public Position() {}

  public Position(
      String name, List<Integer> preferableAttributes, List<Integer> keyAttributes, int weight) {
    this.name = name;
    this.preferableAttributes = preferableAttributes;
    this.keyAttributes = keyAttributes;
    this.weight = weight;
  }

  public String getName() {
    return name;
  }

  public List<Integer> getPreferableAttributes() {
    return preferableAttributes;
  }

  public List<Integer> getKeyAttributes() {
    return keyAttributes;
  }

  public int getWeight() {
    return weight;
  }
}
