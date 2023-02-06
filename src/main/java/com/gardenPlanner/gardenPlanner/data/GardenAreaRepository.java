package com.gardenPlanner.gardenPlanner.data;

import com.gardenPlanner.gardenPlanner.models.GardenArea;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GardenAreaRepository extends CrudRepository<GardenArea, Integer> {
}
