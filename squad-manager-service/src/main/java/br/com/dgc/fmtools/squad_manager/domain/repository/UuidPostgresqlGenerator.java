package br.com.dgc.fmtools.squad_manager.domain.repository;

import com.fasterxml.uuid.Generators;
import java.util.EnumSet;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.generator.BeforeExecutionGenerator;
import org.hibernate.generator.EventType;
import org.hibernate.generator.EventTypeSets;

public class UuidPostgresqlGenerator implements BeforeExecutionGenerator {

  @Override
  public EnumSet<EventType> getEventTypes() {
    return EventTypeSets.INSERT_ONLY;
  }

  @Override
  public Object generate(
      SharedSessionContractImplementor session,
      Object owner,
      Object currentValue,
      EventType eventType) {
    return Generators.timeBasedEpochGenerator().generate();
  }
}
