package com.fedosin.testtask.tests;

import com.fedosin.testtask.pages.YandexMainPage;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.fedosin.testtask.helpers.Environment.yandexMainUrl;

@Tag("yandexmain")
public class YandexMainPageTests extends TestBase {
    @Test
    @DisplayName("Проверка отображения виджета погоды ")
    @Description("Проверка отображения виджета погоды ")
    void checkWeather() {
        YandexMainPage yandexMainPage = new YandexMainPage();

        open(yandexMainUrl);

        yandexMainPage.checkIsWeatherDisplayed();

    }

    @Test
    @DisplayName("Проверка отображения виджета новостей")
    @Description("Проверка отображения виджета новостей")
    void checkNewsCanBeFound() {
        YandexMainPage yandexMainPage = new YandexMainPage();

        open(yandexMainUrl);

        yandexMainPage.checkIsNewsDisplayed();

    }

    @Test
    @DisplayName("Проверка даты")
    @Description("Проверка даты")
    void checkTime() {
        YandexMainPage yandexMainPage = new YandexMainPage();

        open(yandexMainUrl);

        yandexMainPage.checkDayAndMonth();
    }
}
