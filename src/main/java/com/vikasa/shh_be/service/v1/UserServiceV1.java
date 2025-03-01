package com.vikasa.shh_be.service.v1;

import com.vikasa.shh_be.model.User;
import com.vikasa.shh_be.repository.v1.UserRepositoryV1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceV1 {

    @Autowired
    UserRepositoryV1 userRepo;

    public List<User> findAllUsers() {
        return userRepo.findAll();
    }
    public User getUserById(Long id) {
        return userRepo.findById(id).orElse(new User());
    }
    public void addUser(User usr) {
        System.out.println(usr);
        userRepo.save(usr);
    }
    public void deleteUser(Long id) {
        userRepo.deleteById(id);
    }
}
