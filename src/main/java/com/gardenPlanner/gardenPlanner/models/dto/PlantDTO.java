package com.gardenPlanner.gardenPlanner.models.dto;

import com.gardenPlanner.gardenPlanner.models.Garden;
import com.gardenPlanner.gardenPlanner.models.GardenArea;
import com.gardenPlanner.gardenPlanner.models.Plant;

import javax.validation.constraints.NotNull;

public class PlantDTO {

    @NotNull
    private Plant plant;

    @NotNull
    private GardenArea gardenArea;

    @NotNull
    private Garden garden;

    public PlantDTO() {
    }

    public GardenArea getGardenArea() {
        return gardenArea;
    }

    public void setGardenArea(GardenArea gardenArea) {
        this.gardenArea = gardenArea;
    }

    public Garden getGarden() {
        return garden;
    }

    public void setGarden(Garden garden) {
        this.garden = garden;
    }

    public Plant getPlant() {
        return plant;
    }

    public void setPlant(Plant plant) {
        this.plant = plant;
    }
}
