package br.com.radarSJC.controller;

import com.pengrad.telegrambot.model.Update;

import br.com.radarSJC.model.Model;
import br.com.radarSJC.view.View;

public class ControllerSearchRadarDia implements ControllerSearch{

	private Model model;
	private View view;
	
	public ControllerSearchRadarDia(Model model, View view) {
		this.model = model; //connection Controller -> Model
		this.view = view; //connection Controller -> View
	}
	
	@Override
	public void search(Update update) {
		view.sendTypingMessage(update);
		model.searchRadar(update);
	}
	
	

}
