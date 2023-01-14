package com.annadach;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class MethodeTest {

    MainPage mainPage = new MainPage();

    static Stream<Arguments> checkMenuItemsMethode() {
        return Stream.of(
                Arguments.of(
                        1, "Настройки", "Позитивный"
                ),
                Arguments.of(
                        2, "Жалобы", "Позитивный"
                ),
                Arguments.of(
                        3, "Справка", "Позитивный"
                ),
                Arguments.of(
                        4, "Отправить отзыв", "Позитивный"
                )
        );
    }

    @MethodSource()
    @ParameterizedTest
    void checkMenuItemsMethode(int allureId, String menuItems, String testName) {
        mainPage.openPage();
        mainPage.checkMenuItemsMethode(allureId, menuItems, testName);
    }
}
