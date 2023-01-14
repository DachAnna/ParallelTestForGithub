package com.annadach;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;

import java.security.PublicKey;

import static com.annadach.TestData.url;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class MainPage {

    public void openPage() {
        Configuration.browserSize = "2100x1080";
        Selenide.open(url);
    }

    public MainPage checkMenuItemsEnum(EnumItems menuItems) {
        $("#guide").shouldHave(text(menuItems.getDesc()));
        System.out.println("Пункт меню " + "\"" + menuItems.getDesc() + "\"" + " присутствует на главной странице");
        return this;
    }

    public MainPage checkMenuItemsValueSource(String menuItems) {
        $("#guide").shouldHave(text(menuItems));
        System.out.println("Тест на наличие " + "\"" + menuItems + "\"" + " пройден успешно");
        return this;
    }

    public MainPage checkMenuItemsCSV(int allureId, String menuItems, String testName) {
        $("#guide").shouldHave(text(menuItems));
        System.out.println(allureId + ". " + testName + " тест на наличие " + "\"" + menuItems + "\"" + " пройден успешно");
        return this;
    }

    public MainPage checkMenuItemsMethode(int allureId, String menuItems, String testName) {
        $("#guide").shouldHave(text(menuItems));
        System.out.println(allureId + ". " + testName + " тест на наличие " + "\"" + menuItems + "\"" + " пройден успешно");
        return this;
    }
}
