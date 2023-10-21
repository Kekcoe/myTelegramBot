package ru.kekcoe.feignweather.weatherbot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import ru.kekcoe.feignweather.controller.WeatherController;


@Component
public class WeatherBot extends TelegramLongPollingBot {
    private final WeatherController weatherController;
    private static final String START = "/start";
    @Autowired
    public WeatherBot(@Value("${bot.token}") String botToken, WeatherController weatherController) {
        super(botToken);
        this.weatherController = weatherController;
    }


    @Override
    public void onUpdateReceived(Update update) {
        if(!update.hasMessage() || !update.getMessage().hasText()){
            return;
        }
        var message = update.getMessage().getText();
        var chatId = update.getMessage().getChatId();

        switch (message){
            case START -> {
                String userName= update.getMessage().getChat().getUserName();
                startCommand(chatId,userName);
            }
        }
    }

    @Override
    public String getBotUsername() {
        return "kekcoe_weather_bot";
    }

    private void startCommand(Long chatId, String userName){
        var text = "Добро пожаловать в бот, %s"
                + weatherController.getWeather("Дом").toString();
        var formatted= String.format(text, userName);
        sendMessage(chatId,formatted);
    }

    private void sendMessage(Long chatId,String text){
        var chatIdStr = String.valueOf(chatId);
        var sendMessage = new SendMessage(chatIdStr,text);
        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }
}