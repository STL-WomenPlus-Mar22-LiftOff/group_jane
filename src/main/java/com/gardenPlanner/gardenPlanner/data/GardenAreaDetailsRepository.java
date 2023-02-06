package com.gardenPlanner.gardenPlanner.data;

import com.gardenPlanner.gardenPlanner.models.GardenAreaDetails;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GardenAreaDetailsRepository extends CrudRepository<GardenAreaDetails, Integer> {
}
