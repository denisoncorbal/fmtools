package br.com.dgc.fmtools.formation_calculator_service.domain.repository.dao;

import io.hypersistence.utils.hibernate.type.json.JsonBinaryType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.UUID;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.annotations.Type;
import org.hibernate.type.SqlTypes;

@Entity
@Table(name = "TB_FORMATION_CALCULATOR")
public class Formations {
  @Id @UuidPostgresqlGeneratorAnnotation private UUID id;

  @Type(JsonBinaryType.class)
  @JdbcTypeCode(SqlTypes.JSON)
  @Column(name = "formations", columnDefinition = "jsonb")
  private String formations;

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public String getFormations() {
    return formations;
  }

  public void setFormations(String formations) {
    this.formations = formations;
  }

  public Formations() {}

  public Formations(String formations) {
    this.formations = formations;
  }
}
