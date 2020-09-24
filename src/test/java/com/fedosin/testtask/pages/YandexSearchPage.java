package com.fedosin.testtask.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$x;

public class YandexSearchPage {
    private final SelenideElement searchInput = $(By.id("text"));
    private final SelenideElement searchButton = $(By.className("search2__button"));

    private final ElementsCollection productElements = $$x("//h2");

    @Step("Ввод текста в поле поиска")
    public void typeSearch(String text) {
        searchInput.val(text);
        searchButton.click();
    }

    @Step("Проверка отображения результатов поиска")
    public void checkSearchResult() {
        productElements.forEach(selenideElement -> {
            selenideElement.shouldBe(enabled);
        });
    }
}
