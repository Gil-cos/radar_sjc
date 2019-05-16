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
		int i = 0;
		Long id = 1l;

		Element spanSegunda = doc.getElementById(
				"ctl00_ctl00_ctl00_ctl00_ContentPlaceHolderDefault_modelo_master_meio_modelo_uma_coluna_meio_ctl01_Radares_5_Label_segunda");
		spans.add(spanSegunda.text());
		Element spanTerca = doc.getElementById(
				"ctl00_ctl00_ctl00_ctl00_ContentPlaceHolderDefault_modelo_master_meio_modelo_uma_coluna_meio_ctl01_Radares_5_Label_terca");
		spans.add(spanTerca.text());
		Element spanQuarta = doc.getElementById(
				"ctl00_ctl00_ctl00_ctl00_ContentPlaceHolderDefault_modelo_master_meio_modelo_uma_coluna_meio_ctl01_Radares_5_Label_quarta");
		spans.add(spanQuarta.text());
		Element spanQuinta = doc.getElementById(
				"ctl00_ctl00_ctl00_ctl00_ContentPlaceHolderDefault_modelo_master_meio_modelo_uma_coluna_meio_ctl01_Radares_5_Label_quinta");
		spans.add(spanQuinta.text());
		Element spanSexta = doc.getElementById(
				"ctl00_ctl00_ctl00_ctl00_ContentPlaceHolderDefault_modelo_master_meio_modelo_uma_coluna_meio_ctl01_Radares_5_Label_sexta");
		spans.add(spanSexta.text());
		Element spanSabado = doc.getElementById(
				"ctl00_ctl00_ctl00_ctl00_ContentPlaceHolderDefault_modelo_master_meio_modelo_uma_coluna_meio_ctl01_Radares_5_Label_sabado");
		spans.add(spanSabado.text());
		Element spanDomingo = doc.getElementById(
				"ctl00_ctl00_ctl00_ctl00_ContentPlaceHolderDefault_modelo_master_meio_modelo_uma_coluna_meio_ctl01_Radares_5_Label_domingo");
		spans.add(spanDomingo.text());

		for (String span : spans) {
			radares.add(new RadarDia(id, Dia.getDia(i), span));
			i++;
			id++;
		}

		return radares;
	}

}
