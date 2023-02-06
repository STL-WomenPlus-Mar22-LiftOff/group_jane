package com.gardenPlanner.gardenPlanner.data;

import com.gardenPlanner.gardenPlanner.models.PlantDetails;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlantDetailsRepository extends CrudRepository<PlantDetails, Integer> {
}
