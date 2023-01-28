package com.gardenPlanner.gardenPlanner.models;

import com.gardenPlanner.gardenPlanner.data.PlantRepository;
import com.gardenPlanner.gardenPlanner.models.dto.AbstractEntity;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
@Entity
public class Plant extends AbstractEntity {

    public Seed getSeed() {
        return seed;
    }

    public void setSeed(Seed seed) {
        this.seed = seed;
    }

    public PlantRepository getPlantRepository() {
        return plantRepository;
    }

    public void setPlantRepository(PlantRepository plantRepository) {
        this.plantRepository = plantRepository;
    }

    @OneToOne(cascade = CascadeType.ALL)
    @Valid
    @NotNull
    private Seed seed;

@Autowired
    PlantRepository plantRepository;
}

