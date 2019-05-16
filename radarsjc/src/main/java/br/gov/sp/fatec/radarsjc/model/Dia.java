package br.gov.sp.fatec.radarsjc.model;

public enum Dia {

	SEGUNDA, TERÇA, QUARTA, QUINTA, SEXTA, SABADO, DOMINGO;

	public static Dia getDia(int number) {
		switch (number) {
		case 0:
			return SEGUNDA;
		case 1:
			return TERÇA;
		case 2:
			return QUARTA;
		case 3:
			return QUINTA;
		case 4:
			return SEXTA;
		case 5:
			return SABADO;
		case 6:
			return DOMINGO;
		default:
			return QUINTA;
		}
	}

}
