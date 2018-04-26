package com.mtboypbtwoyf.webapplication.tesco.model;

import java.util.stream.Stream;
// TODO: 18/04/2018 WIP to be completed

public enum Groceries {
    FRESH_FOOD,
    BAKERY,
    FOOD_CUPBOARD,
    FROZEN_FOOD,
    DRINKS,
    BABY,
    HEALTH_BEAUTY,
    PETS,
    HOUSEHOLD,
    HOME_ENTS,
    INSPIRATION_EVENTS;

    public String[] getGetValues() {
        return getValues;
    }

    public void setGetValues(String[] getValues) {
        this.getValues = getValues;
    }

    private String[] getValues;

    Groceries() {
    }


    public static String[] names() {
        return Stream.of(Groceries.values()).map(Groceries::name).toArray(String[]::new);
    }
}
