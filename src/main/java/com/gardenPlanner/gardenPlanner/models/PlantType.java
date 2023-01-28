package com.gardenPlanner.gardenPlanner.models;

import com.gardenPlanner.gardenPlanner.data.PlantRepository;
import com.gardenPlanner.gardenPlanner.models.dto.AbstractEntity;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Entity;

@Entity
public class PlantType extends AbstractEntity {
    @Autowired
    public PlantRepository plantRepository;
}
