package com.gardenPlanner.gardenPlanner.models;

public enum PlantType {
    VEGETABLE ("Vegetable"),
    FRUIT("Fruit"),
    FLOWER ("Flower"),
    TREE ("Tree"),
    SHRUB ("Shrub"),
    SUCCULENT ("Succulent");

    private final String displayName;

    PlantType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
