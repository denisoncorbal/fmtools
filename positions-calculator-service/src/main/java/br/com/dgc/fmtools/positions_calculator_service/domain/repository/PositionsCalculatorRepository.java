package br.com.dgc.fmtools.positions_calculator_service.domain.repository;

import br.com.dgc.fmtools.positions_calculator_service.domain.repository.dao.Positions;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PositionsCalculatorRepository extends JpaRepository<Positions, UUID> {}
