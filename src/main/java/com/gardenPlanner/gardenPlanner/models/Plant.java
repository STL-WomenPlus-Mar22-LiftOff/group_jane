package com.gardenPlanner.gardenPlanner.models;

import javax.persistence.CascadeType;
import javax.persistence.OneToOne;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class Plant {

    @OneToOne(cascade = CascadeType.ALL)
    @Valid
    @NotNull
    private Seed seed;

}
