package com.gardenPlanner.gardenPlanner.models;

public enum Ph {
    PH4A("Ph: 4.0-4.4"),
    PH4B("Ph: 4.5-4.9"),
    PH5A("Ph: 5.0-5.4"),
    PH5B("Ph: 5.5-5.9"),
    PH6A("Ph: 6.0-6.4"),
    PH6B("Ph: 6.5-6.9"),
    PH7A("Ph: 7.0-7.5"),
    PH7B("Ph: 7.5-7.9"),
    PH8A("Ph: 8.0-8.5"),
    PH8B("Ph: 8.5-8.9"),
    PH9("Ph: 9.0+");

    private final String displayName;

    Ph(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
