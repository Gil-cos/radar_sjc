package br.gov.sp.fatec.radarsjc.service;

import br.gov.sp.fatec.radarsjc.model.Dia;
import br.gov.sp.fatec.radarsjc.model.RadarDia;
import br.gov.sp.fatec.radarsjc.repository.RadarDiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Alexandre Murata on 25/02/19.
 * @project radarsjc
 */
@Service
public class RadarDiaService {

	@Autowired
	private RadarDiaRepository repository;

	public List<RadarDia> findAll() {
		return repository.findAll();
	}

	public RadarDia findByDay(final Dia date) {
		return repository.findByDay(date);
	}
}
