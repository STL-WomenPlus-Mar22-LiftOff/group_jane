package com.gardenPlanner.gardenPlanner.models;

import com.gardenPlanner.gardenPlanner.models.dto.AbstractEntity;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class GardenAreaDetails extends AbstractEntity {

    @OneToOne(mappedBy = "gardenAreaDetails")
    private GardenArea gardenArea;
}
