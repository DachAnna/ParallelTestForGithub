package com.annadach;

public enum EnumItems {
    ONLINE("Настройки"),
    CINEMA("Жалобы"),
    SERIES("Справка"),
    TICKETS("Отправить отзыв");

    private String desc;

    EnumItems(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }
}
