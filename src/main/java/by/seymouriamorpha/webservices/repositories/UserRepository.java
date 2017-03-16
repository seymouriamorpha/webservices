package by.seymouriamorpha.webservices.repositories;

import by.seymouriamorpha.webservices.beans.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * @author seymouriamorpha on 3/16/2017.
 */
public interface UserRepository extends MongoRepository<User, String> {

    List<User> findAll();

    User findByEmail(String email);

    User findByLogin(String login);

}
