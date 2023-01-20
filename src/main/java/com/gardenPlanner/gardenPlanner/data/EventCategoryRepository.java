package com.gardenPlanner.gardenPlanner.data;

import com.gardenPlanner.gardenPlanner.models.EventCategory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventCategoryRepository extends CrudRepository<EventCategory, Integer> {
}