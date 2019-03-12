package com.fatec.radarSJC;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class Bot extends TelegramLongPollingBot {

	public void onUpdateReceived(Update update) {

		String command = update.getMessage().getText();

		SendMessage message = new SendMessage();

		if ("dia".equals(command)) {
			message.setText("dia");
		}

		if ("semana".equals(command)) {
			message.setText("semana");
		}

		message.setChatId(update.getMessage().getChatId());

		try {
			execute(message);
		} catch (TelegramApiException e) {
			e.printStackTrace();
		}
	}

	public String getBotUsername() {
		return "Radar_sj_bot";
	}

	@Override
	public String getBotToken() {
		return "652012260:AAG6KlEmY9OmyXgkdmUwNwndI6ePjJ3ejdk";
	}

}
