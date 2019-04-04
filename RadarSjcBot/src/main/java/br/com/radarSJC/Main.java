package br.com.radarSJC;

import br.com.radarSJC.model.Model;
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
		
	}

}
