package com.gardenPlanner.gardenPlanner.models;

public enum EventType {
    HARVEST("Harvest"),
    WATER("Water"),
    AMEND("Soil Amendment"),
    TREAT("Treatment"),
    INSPECT("Inspect"),
    MULCH("Mulch"),
    PLANT("Plant");

    private final String displayName;

    EventType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
