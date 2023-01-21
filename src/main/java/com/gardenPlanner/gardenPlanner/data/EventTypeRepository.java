package com.gardenPlanner.gardenPlanner.data;

import com.gardenPlanner.gardenPlanner.models.EventType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventTypeRepository extends CrudRepository<EventType, Integer> {
}