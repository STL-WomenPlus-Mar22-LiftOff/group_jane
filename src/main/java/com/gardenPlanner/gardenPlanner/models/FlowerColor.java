package com.gardenPlanner.gardenPlanner.models;

import com.gardenPlanner.gardenPlanner.data.FlowerColorRepository;
import com.gardenPlanner.gardenPlanner.models.dto.AbstractEntity;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Entity;

@Entity
public class FlowerColor extends AbstractEntity {
    @Autowired
    public FlowerColorRepository flowerColorRepository;

}
