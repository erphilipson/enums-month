package com.example.common;

/**
 * Created by Ethan on 7/25/17.
 */
public enum Month {
    JANUARY("January"),
    FEBRUARY("February"),
    MARCH("March"),
    APRIL("April"),
    MAY("May"),
    JUNE("June"),
    JULY("July"),
    AUGUST("August"),
    SEPTEMBER("September"),
    OCTOBER("October"),
    NOVEMBER("November"),
    DECEMBER("December");

    private String englishName;

    Month (String englishName) {
        this.englishName = englishName;
    }

    public String getEnglishName() {
        return englishName;
    }
}