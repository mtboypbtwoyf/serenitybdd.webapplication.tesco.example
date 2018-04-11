package com.mtboypbtwoyf.webapplication.tesco.model;

import java.util.stream.Stream;

public enum NavigationMenu {
    GROCERIES,
    BANK,
    CLUBCARD;

    public static String[] names() {
        return Stream.of(NavigationMenu.values()).map(NavigationMenu::name).toArray(String[]::new);
    }
}
