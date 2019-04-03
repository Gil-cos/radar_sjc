package br.com.radarSJC.model;

import java.util.LinkedList;
import java.util.List;

import com.pengrad.telegrambot.model.Update;

import br.com.radarSJC.utils.Connection;
import br.com.radarSJC.utils.Observer;
import br.com.radarSJC.utils.Subject;

public class Model implements Subject {

	private List<Observer> observers = new LinkedList<Observer>();

	private List<RadarDia> radares = new LinkedList<RadarDia>();
	
	private Connection connection = new Connection();

	private static Model uniqueInstance;

	private Model() {
	}

	public static Model getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new Model();
		}
		return uniqueInstance;
	}

	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	public void notifyObservers(long chatId, String studentsData) {
		for (Observer observer : observers) {
			observer.update(chatId, studentsData);
		}
	}

	public void addRadar(RadarDia radar) {
		this.radares.add(radar);
	}

	public String getRadares(Update update) {
		String radarData = "";
		for (RadarDia radar : radares) {
			if ("/semana".equals(update.message().text().toLowerCase()))
				radarData += "\n" + radar.getDate() + "\n" + radar.getLocal() + "\n";
		}

		if (radarData != "") {
			return radarData;
		} else {
			return "Dia invalido";
		}
	}

	public String getRadaresRest(Update update) {
		String radarData = "";
		RadarDia[] radaresRest = connection.getAll();
		
		for (RadarDia radar : radaresRest) {
			if ("/semana".equals(update.message().text().toLowerCase()))
				radarData += "\n" + radar.getDate() + "\n" + radar.getLocal() + "\n";
		}

		if (radarData != "") {
			return radarData;
		} else {
			return "Dia invalido";
		}
	}
	
	public void searchRadar(Update update) {
		String radarData = null;
		
		RadarDia radareRest = connection.get(update.message().text());
		
		radarData = radareRest.getDate() + "\n" + radareRest.getLocal();

		if (radarData != null) {
			this.notifyObservers(update.message().chat().id(), radarData);
		} else {
			this.notifyObservers(update.message().chat().id(), "Dia invalido");
		}

	}
	
//	public void searchRadar(Update update) {
//		String radarData = null;
//		for (RadarDia radar : radares) {
//			if (radar.getDate().toString().toLowerCase().equals(update.message().text()))
//				radarData = radar.getDate() + "\n" + radar.getLocal();
//		}
//
//		if (radarData != null) {
//			this.notifyObservers(update.message().chat().id(), radarData);
//		} else {
//			this.notifyObservers(update.message().chat().id(), "Dia invalido");
//		}
//
//	}

}