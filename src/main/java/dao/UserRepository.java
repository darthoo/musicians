package dao;

import entity.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Odyniuk on 21/03/2017.
 */
public interface UserRepository extends CrudRepository<User, Integer>{
}
