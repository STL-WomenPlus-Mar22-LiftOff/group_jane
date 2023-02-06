package com.gardenPlanner.gardenPlanner.data;

import com.gardenPlanner.gardenPlanner.models.Plant;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlantRepository extends CrudRepository <Plant,Integer> {
        }
