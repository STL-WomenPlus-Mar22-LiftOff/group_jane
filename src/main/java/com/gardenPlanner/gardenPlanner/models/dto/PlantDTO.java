package com.gardenPlanner.gardenPlanner.models.dto;

import com.gardenPlanner.gardenPlanner.models.Plant;

import javax.validation.constraints.NotNull;

public class PlantDTO {

    @NotNull
    private Plant plant;

    public PlantDTO() {
    }

    public Plant getPlant() {
        return plant;
    }

    public void setPlant(Plant plant) {
        this.plant = plant;
    }
}
