package com.gardenPlanner.gardenPlanner.data;

import com.gardenPlanner.gardenPlanner.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

    User findByUsername(String username);

}
