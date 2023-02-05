package com.gardenPlanner.gardenPlanner.models;

import com.gardenPlanner.gardenPlanner.models.dto.AbstractEntity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Plant extends AbstractEntity {

    @NotBlank(message = "Common Name is required!")
    @Size(min = 3, max = 50, message = "Common name should be between 3 and 50 characters.")
    private String commonName;

    @OneToOne(cascade = CascadeType.ALL)
    @Valid
    @NotNull
    private PlantDetails plantDetails;

    @ManyToMany(mappedBy = "plants")
    private final List<GardenArea> gardenAreas = new ArrayList<>();

    public Plant(String commonName, PlantDetails plantDetails) {
        this.commonName = commonName;
        this.plantDetails = plantDetails;
    }

    public Plant() {
    }

    public String getCommonName() {
        return commonName;
    }

    public void setCommonName(String commonName) {
        this.commonName = commonName;
    }

    public PlantDetails getPlantDetails() {
        return plantDetails;
    }

    public void setPlantDetails(PlantDetails plantDetails) {
        this.plantDetails = plantDetails;
    }
}
