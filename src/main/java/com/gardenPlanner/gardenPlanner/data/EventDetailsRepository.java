package com.gardenPlanner.gardenPlanner.data;

import com.gardenPlanner.gardenPlanner.models.EventDetails;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventDetailsRepository extends CrudRepository<EventDetails, Integer> {
}
