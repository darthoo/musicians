package service;

import dao.UserRepository;
import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Odyniuk on 21/03/2017.
 */
@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User findById(Integer id) {
        return userRepository.findOne(id);
    }


    public List<User> findAll() {
        return (List<User>) userRepository.findAll();
    }

    public void save(User user) {
        userRepository.save(user);
    }

    public void delete(Integer id) {
        userRepository.delete(id);
    }
}
