package com.annadach;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ValueTest {

    MainPage mainPage = new MainPage();

    @ValueSource(strings = {
            "Настройки",
            "Жалобы",
            "Справка",
            "Отправить отзыв"
    })
    @ParameterizedTest
    void checkMenuItemsValueSource(String menuItems) {
        mainPage.openPage();
        mainPage.checkMenuItemsValueSource(menuItems);
    }
}
