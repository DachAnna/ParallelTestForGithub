package com.annadach;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;


public class EnumTest {

    MainPage mainPage = new MainPage();

    @EnumSource(value = EnumItems.class, mode = EnumSource.Mode.EXCLUDE)
    @ParameterizedTest(name = "{1}")
    void checkMenuItemsEnum(EnumItems menuItems) {
        mainPage.openPage();
        mainPage.checkMenuItemsEnum(menuItems);
    }
}
