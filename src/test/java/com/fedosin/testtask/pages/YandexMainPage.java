package com.fedosin.testtask.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.time.LocalDate;

import static com.codeborne.selenide.Selenide.$;

public class YandexMainPage {
    private final SelenideElement newsWidget = $(By.id("wd-_topnews"));
    private final SelenideElement weatherWidget = $(By.id("wd-_weather"));
    private final SelenideElement currentDay = $(By.className("datetime__day"));
    private final SelenideElement currentMonth = $(By.className("datetime__month"));
    private final SelenideElement something = $(By.className("news__head-item"));


    @Step("Проверка отображения новостей")
    public void checkIsNewsDisplayed() {
        newsWidget.shouldBe(Condition.visible);
    }

    @Step("Проверка отображения погоды")
    public void checkIsWeatherDisplayed() {
        weatherWidget.shouldBe(Condition.visible);
    }

    @Step("Проверка актуальности даты")
    public void checkDayAndMonth() {
        LocalDate currentDate = LocalDate.now();

        String expectedDay = String.valueOf(currentDate.getDayOfMonth());
        Assert.assertEquals("Wrong day", expectedDay, currentDay.getText());
    }
}
