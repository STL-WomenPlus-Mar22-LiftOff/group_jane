package com.gardenPlanner.gardenPlanner.models;

public enum SoilTexture {
    CLAY("Clay Soil"),
    CLAYLOAM("Clay Loam Soil"),
    SAND("Sandy Soil"),
    SANDLOAM("Sandy Loam Soil"),
    LOAM("Loam Soil"),
    SILT("Silt Soil"),
    SILTCLAY("Silty Clay Soil"),
    SILTLOAM("Silty Loam Soil"),
    SANDCLAY("Sandy Clay Soil");

    private final String displayName;

    SoilTexture(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
