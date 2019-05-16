package br.gov.sp.fatec.radarsjc.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @author Alexandre Murata on 20/02/19.
 * @project radarsjc
 */
@Data
@Entity
@Table(name = "radar_dia")
@NoArgsConstructor
@AllArgsConstructor
public class RadarDia {

	public RadarDia(Long id, Dia date, String local) {
		this.id = id;
		this.date = date;
		this.local = local;
	}
	
	public RadarDia() {
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
