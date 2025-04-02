package br.com.dgc.fmtools.formation_calculator_service.domain.repository;

import br.com.dgc.fmtools.formation_calculator_service.domain.repository.dao.Formations;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FormationsRepository extends JpaRepository<Formations, UUID> {}
