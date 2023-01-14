package com.annadach;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CsvTest {

    MainPage mainPage = new MainPage();

    @CsvSource(value = {
            "1; Настройки; Позитивный",
            "2; Жалобы; Позитивный",
            "3; Справка; Позитивный",
            "4; Отправить отзыв; Позитивный",
    }, delimiter = ';')
    @ParameterizedTest
    void checkMenuItemsCSV(int allureId, String menuItems, String testName) {
        mainPage.openPage();
        mainPage.checkMenuItemsCSV(allureId, menuItems, testName);
    }
}
