package br.com.radarSJC.model;

public class RadarDia {

	private Long id;
	private Dia date;
	private String local;

	public RadarDia() {
		// TODO Auto-generated constructor stub
	}

	public RadarDia(Dia date, String local) {
		this.date = date;
		this.local = local;
	}
	
	@Override
	public String toString() {
	
		return "Dia: " + this.date + " Local: " + this.local + "\n";
	}
	
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
