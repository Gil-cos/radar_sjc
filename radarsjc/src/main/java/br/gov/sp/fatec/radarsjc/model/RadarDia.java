package br.gov.sp.fatec.radarsjc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * @author Alexandre Murata on 20/02/19.
 * @project radarsjc
 */
@Data
@Entity
@Table(name = "radar_dia")
public class RadarDia {
	
	public RadarDia() {
	}

	public RadarDia(Long id, Dia date, String local) {
		this.id = id;
		this.date = date;
		this.local = local;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column
	private Dia date;

	@Column
	private String local;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Dia getDate() {
		return date;
	}

	public void setDate(Dia date) {
		this.date = date;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}
}
