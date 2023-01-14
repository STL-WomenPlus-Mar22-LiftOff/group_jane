package main.java.org.launchcode.TimeLeaf.data;

import main.java.org.launchcode.TimeLeaf.models.User;

public interface UserRepository extends CrudRepository<User, Integer> {

    User findByUsername(String username);

}