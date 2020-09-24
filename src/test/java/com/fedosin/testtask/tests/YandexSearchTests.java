package com.fedosin.testtask.tests;

import com.fedosin.testtask.pages.YandexSearchPage;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.fedosin.testtask.helpers.Environment.yaUrl;
import static com.fedosin.testtask.helpers.Environment.yandexSearchText;

@Tag("yandexsearch")
public class YandexSearchTests extends TestBase {
    @Test
    @DisplayName("Проверка поиска в яндекс ")
    @Description("Checks if search result display")
    void checkItemCanBeFound() {
        YandexSearchPage yandexSearchPage = new YandexSearchPage();

        open(yaUrl);

        yandexSearchPage.typeSearch(yandexSearchText);
        yandexSearchPage.checkSearchResult();
    }
}
