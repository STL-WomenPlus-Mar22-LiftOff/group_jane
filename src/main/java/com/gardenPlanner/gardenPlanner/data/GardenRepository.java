package com.gardenPlanner.gardenPlanner.data;

import com.gardenPlanner.gardenPlanner.models.Garden;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GardenRepository extends CrudRepository<Garden, Integer> {
}
