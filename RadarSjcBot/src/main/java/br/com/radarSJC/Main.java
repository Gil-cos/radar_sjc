package br.com.radarSJC;

import br.com.radarSJC.model.Dia;
import br.com.radarSJC.model.Model;
import br.com.radarSJC.model.RadarDia;
import br.com.radarSJC.utils.Connection;
import br.com.radarSJC.view.View;

public class Main {

	private static Model model;

	public static void main(String[] args) {

		model = Model.getInstance();
		initializeModel(model);
		View view = new View(model);
		model.registerObserver(view); // connection Model -> View
		view.receiveUsersMessages();
	}

	public static void initializeModel(Model model) {
		
		model.addRadar(new RadarDia(Dia.DOMINGO,
				"Av. General Motors (60 km/h) General Motors\n" + 
				"R. Roma (50 km/h) Jd. Augusta\n" + 
				"Av. Princesa Isabel (60 km/h) Santana\n" + 
				"Av. São João (60 km/h) Jd. Esplanada"));
		
		model.addRadar(new RadarDia(Dia.SEGUNDA,
				"Av. Possidônio José de Freitas (60 km/h) Urbanova\n" + 
				"Av. Com. Vicente de Paulo Penido (60 km/h) Jd. Aquarius\n" + 
				"Av. Nove de Julho (50 km/h) V. Adyana\n" + 
				"Av. Andrômeda (50 km/h) Jd. Satélite"));
		
		model.addRadar(new RadarDia(Dia.TERÇA,
				"Av. Ouro Fino (50 km/h) Bq. dos Eucaliptos\n" + 
				"Av. Antonio Galvão Jr. (50 km/h) Res. Galo Branco\n" + 
				"R. Carvalho de Araujo (50 km/h) V. Maria\n" + 
				"R. José Guilherme de Almeida (60 km/h) Jd. Satélite"));
		
		model.addRadar(new RadarDia(Dia.QUARTA,
				"E. M. Dom José Antonio do Couto (60 km/h) Petrobras\n" + 
				"R. Estados Unidos (50 km/h) Vista Verde\n" + 
				"Av. Pres. Tancredo Neves (60 km/h) Jd. San Rafael\n" + 
				"R. D. Genésia B. Tarantino (60 km/h) V. Piratininga"));
		
		model.addRadar(new RadarDia(Dia.QUINTA,
				"R. Água Marinha (50 km/h) Jd. São José\n" + 
				"Av. Cidade Jardim (60 km/h) Jd. Satélite\n" + 
				"Av. George Eastman (60 km/h) Cj. 31 de Março\n" + 
				"Av. Ademar de Barros (50 km/h) V. Adyana"));
		
		model.addRadar(new RadarDia(Dia.SEXTA,
				"R. Candeias (50 km/h) Jd. Vale do Sol\n" + 
				"Av. Ironman Victor Garrido (50 km/h) Urbanova\n" + 
				"Av. Salinas (60 km/h) Bq. dos Eucaliptos\n" + 
				"Av. Anchieta (50 km/h)  V. Adyana"));
		
		model.addRadar(new RadarDia(Dia.SABADO,
				"Av. Paulista (50 km/h)  Jd. Esplanada\n" + 
				"Av. Caravelas (50 km/h) Jd. Vale do Sol\n" + 
				"Av. Uberaba (50 km/h)  Jd. Ismênia\n" + 
				"Av. Engº Francisco José Longo (50 km/h) Jd. São Dimas"));
			
	}

}
