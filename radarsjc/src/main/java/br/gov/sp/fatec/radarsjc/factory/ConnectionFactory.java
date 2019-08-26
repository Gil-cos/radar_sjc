package br.gov.sp.fatec.radarsjc.factory;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.stereotype.Component;

@Component
public class ConnectionFactory {
	
	private String url = "http://servicos2.sjc.sp.gov.br/servicos/radares.aspx";
	
	public Document getConnection() {
		
		try {
			
			Document doc = Jsoup.connect(url).get();
			return doc;
			
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
