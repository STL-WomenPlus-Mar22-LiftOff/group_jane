package com.gardenPlanner.gardenPlanner.models;

import com.gardenPlanner.gardenPlanner.models.dto.AbstractEntity;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class GardenDetails extends AbstractEntity {

    @OneToOne(mappedBy = "gardenDetails")
    private Garden garden;

}

