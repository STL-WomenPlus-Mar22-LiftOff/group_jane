package com.gardenPlanner.gardenPlanner.models;

import com.gardenPlanner.gardenPlanner.models.dto.AbstractEntity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Garden extends AbstractEntity {

    //one to one gardenDetails
    @OneToOne(cascade = CascadeType.ALL)
    @Valid
    @NotNull
    private GardenDetails gardenDetails;

    //one garden to many garden areas

    @OneToMany(mappedBy = "garden")
    private final List<GardenArea> gardenAreas = new ArrayList<>();
}
