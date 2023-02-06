package com.gardenPlanner.gardenPlanner.models;


//created by Katie
public enum FlowerColor {
    RED("Red"),
    ORANGE("Orange"),
    YELLOW("Yellow"),
    GREEN("Green"),
    BLUE("Blue"),
    PURPLE("Purple"),
    PINK("Pink"),
    WHITE("White");

    private final String displayName;

    FlowerColor(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
