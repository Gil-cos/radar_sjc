package br.gov.sp.fatec.radarsjc.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.springframework.stereotype.Component;

import br.gov.sp.fatec.radarsjc.model.Dia;
import br.gov.sp.fatec.radarsjc.model.RadarDia;

@Component
public class JsoupService {

	private String url = "http://servicos2.sjc.sp.gov.br/servicos/radares.aspx";

	public List<RadarDia> getRadares() throws IOException {

		Document doc = Jsoup.connect(url).get();

		List<RadarDia> radares = new ArrayList<RadarDia>();
		List<String> spans = new ArrayList<String>();
		String[] dias = { "segunda", "terca", "quarta", "quinta", "sexta", "sabado", "domingo" };
		int i = 0;
		Long id = 1l;
		Element spanDefault;

		for (int j = 0; j < dias.length; j++) {
			spanDefault = doc.getElementById(
					"ctl00_ctl00_ctl00_ctl00_ContentPlaceHolderDefault_modelo_master_meio_modelo_uma_coluna_meio_ctl01_Radares_5_Label_"
							+ dias[j]);
			spans.add(spanDefault.text());
		}

		spans = formatLocal(spans);

		for (String span : spans) {
			radares.add(new RadarDia(id, Dia.getDia(i), span));
			i++;
			id++;
		}

		return radares;
	}

	private List<String> formatLocal(List<String> spans) {

		String[] ruas = { "R. ", "Av.", "E. ", "MANUTENÇÃO" };
		String[] ruasPrefix = { "-R. ", "-Av.", "-E.", "-MANUTENÇÃO" };
		List<String> novoSpans = new ArrayList<String>();
		String nova = null;

		for (String span : spans) {
			nova = span.replaceAll(ruas[0], ruasPrefix[0]);
			nova = nova.replaceAll(ruas[1], ruasPrefix[1]);
			nova = nova.replaceAll(ruas[2], ruasPrefix[2]);
			nova = nova.replaceAll(ruas[3], ruasPrefix[3]);
			novoSpans.add(nova);
		}

		return novoSpans;
	}

}
