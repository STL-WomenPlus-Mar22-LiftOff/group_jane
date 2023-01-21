package com.gardenPlanner.gardenPlanner.data;

import com.gardenPlanner.gardenPlanner.models.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends CrudRepository<Event, Integer> {
}
