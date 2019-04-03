package br.gov.sp.fatec.radarsjc.repository;

import br.gov.sp.fatec.radarsjc.model.Dia;
import br.gov.sp.fatec.radarsjc.model.RadarDia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * @author Alexandre Murata on 25/02/19.
 * @project radarsjc
 */
@Repository
public interface RadarDiaRepository extends JpaRepository<RadarDia,Long> {

	@Query("FROM RadarDia r where r.date = :date")
	RadarDia findByDay(final Dia date);
}
