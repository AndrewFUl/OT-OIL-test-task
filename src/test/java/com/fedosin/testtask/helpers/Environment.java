package com.fedosin.testtask.helpers;

import static java.lang.Boolean.parseBoolean;

public class Environment {
    public static final String
            selenoidUrl = System.getProperty("selenoid_url", ""),
            selenoidUsername = System.getProperty("selenoid_username", ""),
            selenoidPassword = System.getProperty("selenoid_password", ""),
            yaUrl = System.getProperty("yandexUrl", "https://ya.ru/"),
            yandexSearchText = System.getProperty("yandexSearchText", "Основы автоматизации тестирования"),
            yandexMainUrl = System.getProperty("yandexMainUrl", "https://yandex.ru/");

    public static final boolean
            isHeadless = parseBoolean(System.getProperty("isHeadless", "false")),
            isSelenoid = selenoidUrl != "";
}
