package com.company;

public enum CardRange {
    ACE (11),
    KING (10),
    QUEEN (10),
    JACK (10),
    TEN (10),
    NINE (9),
    EIGHT (8),
    SEVEN (7),
    SIX (6),
    FIVE (5),
    FOUR (4),
    THREE (3),
    TWO (2);
    private final int power;
    CardRange (int power) {
        this.power = power;
    }
    int getPower () {
        return power;
    }
}