package br.gov.sp.fatec.radarsjc.jsoup;

import java.io.IOException;

import br.gov.sp.fatec.radarsjc.service.JsoupService;

public class JsoupTest {

	public static void main(String[] args) throws IOException {

		JsoupService jsoupService = new JsoupService();
		
		System.out.println(jsoupService.getRadares().get(0).getId());
		System.out.println(jsoupService.getRadares().get(1).getId());
	}
}
