package com.gardenPlanner.gardenPlanner.models;

public enum BedType {
    RAISED("Raised Bed"),
    INGROUND("In Ground Garden Bed"),
    ROW("Row Garden"),
    CONTAINER("Container Garden"),
    PERMACULTURE("Permaculture Garden");

    private final String displayName;

    BedType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
