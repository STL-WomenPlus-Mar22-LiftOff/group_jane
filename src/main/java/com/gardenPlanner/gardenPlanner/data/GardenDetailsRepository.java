package com.gardenPlanner.gardenPlanner.data;

import com.gardenPlanner.gardenPlanner.models.GardenDetails;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GardenDetailsRepository extends CrudRepository<GardenDetails, Integer> {
}
