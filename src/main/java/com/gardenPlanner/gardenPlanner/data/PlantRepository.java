package com.gardenPlanner.gardenPlanner.data;

import com.gardenPlanner.gardenPlanner.models.Plant;
import org.springframework.data.repository.CrudRepository;

public interface PlantRepository extends CrudRepository <Plant,Integer> {
        }
