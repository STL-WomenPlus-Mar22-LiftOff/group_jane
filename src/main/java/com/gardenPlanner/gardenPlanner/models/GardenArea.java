package com.gardenPlanner.gardenPlanner.models;

import com.gardenPlanner.gardenPlanner.models.dto.AbstractEntity;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
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
}
