package br.com.dgc.fmtools.positions_calculator_service.domain.repository.dao;

import java.util.UUID;

import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.annotations.Type;
import org.hibernate.type.SqlTypes;

import io.hypersistence.utils.hibernate.type.json.JsonBinaryType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_POSITIONS_CALCULATOR")
public class Positions {
  @Id
  private UUID id;

  @Type(JsonBinaryType.class)
  @JdbcTypeCode(SqlTypes.JSON)
  @Column(name = "positions", columnDefinition = "jsonb")
  private String positions;

  public Positions() {
  }

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public String getPositions() {
    return positions;
  }

  public void setPositions(String positions) {
    this.positions = positions;
  }

  public Positions(UUID id, String positions) {
    this.id = id;
    this.positions = positions;
  }
}
