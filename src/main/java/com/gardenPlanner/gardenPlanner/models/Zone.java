package com.gardenPlanner.gardenPlanner.models;

public enum Zone {
    ZONE1A("Zone 1A"),
    ZONE1B("1B"),
    ZONE2A("2A"),
    ZONE2B("2B"),
    ZONE3A("3A"),
    ZONE3B("3B"),
    ZONE4A("4A"),
    ZONE4B("4B"),
    ZONE5A("5A"),
    ZONE5B("5B"),
    ZONE6A("6A"),
    ZONE6B("6B"),
    ZONE7A("7A"),
    ZONE7B("7B"),
    ZONE8A("8A"),
    ZONE8B("8B"),
    ZONE9A("9A"),
    ZONE9B("9B"),
    ZONE10A("10A"),
    ZONE10B("10B"),
    ZONE11A("11A"),
    ZONE11B("11B"),
    ZONE12A("12A"),
    ZONE12B("12B"),
    ZONE13A("13A"),
    ZONE13B("13B");
    private final String displayName;

    Zone (String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
