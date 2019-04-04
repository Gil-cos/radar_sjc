package br.com.radarSJC.service;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import com.google.gson.Gson;

import br.com.radarSJC.model.Dia;
import br.com.radarSJC.model.RadarDia;

public class RadarDiaService {

	public RadarDia[] getAll() {

		Gson gson = new Gson();
		RadarDia[] radares = null;

		HttpClient httpClient = HttpClients.createDefault();
		HttpGet httpGet = new HttpGet("http://localhost:8080/lista");
		httpGet.addHeader("accept", "application/json");

		try {
			HttpResponse response = httpClient.execute(httpGet);

			if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
				HttpEntity entity = response.getEntity();

				String json = EntityUtils.toString(entity);

				radares = gson.fromJson(json, RadarDia[].class);
			}
			return radares;

		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			httpGet.releaseConnection();
		}

		return radares;
	}

	public RadarDia get(String dia) {

		Gson gson = new Gson();
		RadarDia radar = null;

		HttpClient httpClient = HttpClients.createDefault();
		HttpGet httpGet = new HttpGet("http://localhost:8080/lista/" + dia.toUpperCase());
		httpGet.addHeader("accept", "application/json");

		try {
			HttpResponse response = httpClient.execute(httpGet);

			if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
				HttpEntity entity = response.getEntity();

				String json = EntityUtils.toString(entity);

				radar = gson.fromJson(json, RadarDia.class);

				return radar;
			}
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			httpGet.releaseConnection();
		}
		return radar;
	}

}
