package com.gardenPlanner.gardenPlanner.models;

import com.gardenPlanner.gardenPlanner.models.dto.AbstractEntity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Garden extends AbstractEntity {

    //one to one gardenDetails
    @OneToOne(cascade = CascadeType.ALL)
    @Valid
    @NotNull
    private GardenDetails gardenDetails;


    //one to one user

    @OneToOne(cascade = CascadeType.ALL)
    @Valid
    @NotNull
    private User user;

    //one garden to many garden areas

    @OneToMany(mappedBy = "garden")
    private final List<GardenArea> gardenAreas = new ArrayList<>();

    @NotNull(message = "Garden Name Required")
    @Size(min = 1, max = 50, message = "Garden name should be between 1 and 50 characters!")
    private String name;

    public Garden(GardenDetails gardenDetails, User user, String name) {
        this.gardenDetails = gardenDetails;
        this.user = user;
        this.name = name;
    }

    public Garden() {
    }

    public User getUser() {
        return user;
    }

    public GardenDetails getGardenDetails() {
        return gardenDetails;
    }

    public void setGardenDetails(GardenDetails gardenDetails) {
        this.gardenDetails = gardenDetails;
    }

    public List<GardenArea> getGardenAreas() {
        return gardenAreas;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
