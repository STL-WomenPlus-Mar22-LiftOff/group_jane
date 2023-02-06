package com.gardenPlanner.gardenPlanner.models;

import com.gardenPlanner.gardenPlanner.models.dto.AbstractEntity;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class GardenArea extends AbstractEntity {

    //one to one gardenArea to gardenAreaDetails

    @OneToOne(cascade = CascadeType.ALL)
    @Valid
    @NotNull
    private GardenAreaDetails gardenAreaDetails;

    //many plants to many garden areas

    @ManyToMany
    private final List<Plant> plants = new ArrayList<>();

    //one garden to many garden areas

    @ManyToOne
    @NotNull(message = "Garden is required")
    private Garden garden;

    @NotNull (message = "Name is required!")
    @Size(min = 1, max = 50, message = "Name should be between 1 and 50 characters.")
    private String name;

//    private boolean isPlanted;
//
//    private boolean isGreenhouse;
//

    public GardenArea() {
    }
    public GardenArea(GardenAreaDetails gardenAreaDetails, Garden garden, String name) {
        this.gardenAreaDetails = gardenAreaDetails;
        this.garden = garden;
        this.name = name;
    }

    public GardenAreaDetails getGardenAreaDetails() {
        return gardenAreaDetails;
    }

    public void setGardenAreaDetails(GardenAreaDetails gardenAreaDetails) {
        this.gardenAreaDetails = gardenAreaDetails;
    }

    public List<Plant> getPlants() {
        return plants;
    }

    public Garden getGarden() {
        return garden;
    }

    public void setGarden(Garden garden) {
        this.garden = garden;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
