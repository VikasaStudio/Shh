package com.vikasa.shh_be.service.v1;

import com.vikasa.shh_be.dto.request.CreateUserDTO;
import com.vikasa.shh_be.dto.request.UpdateUserDTO;
import com.vikasa.shh_be.dto.response.UserDAO;
import com.vikasa.shh_be.mapper.CreateUserDTOToUserMapper;
import com.vikasa.shh_be.mapper.UserToUserDTOMapper;
import com.vikasa.shh_be.model.User;
import com.vikasa.shh_be.repository.v1.UserRepositoryV1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceV1 {

    @Autowired
    UserRepositoryV1 userRepo;

    @Autowired
    CreateUserDTOToUserMapper createUserToUserMapper;

    @Autowired
    UserToUserDTOMapper userToUserDTOMapper;

    public List<User> findAllUsers() {
        return userRepo.findAll();
    }
    public UserDAO getUserById(String id) {
        Optional<User> obj = userRepo.findById(id);
        return userToUserDTOMapper.apply(obj.orElse(null));
    }
    public UserDAO addUser(CreateUserDTO usr) {
        User obj = userRepo.save(createUserToUserMapper.apply(usr));
        return userToUserDTOMapper.apply(obj);
    }
    public UserDAO updateUser(String id, UpdateUserDTO usr) {
        User obj = userRepo.findById(id).orElse(null);
        if(obj == null)
            return null;
        obj.setName(usr.getName());
        obj.setSecret(usr.getSecret());
        obj.setAge(usr.getAge());
        obj.setLatitude(usr.getLatitude());
        obj.setLongitude(usr.getLongitude());
        userRepo.saveAndFlush(obj);
        return userToUserDTOMapper.apply(obj);
    }
    public void deleteUsers(List<String> ids) {
        List<User> users = userRepo.findAllById(ids);
        users.forEach(user -> {
            user.setIsActive(false);
        });
        userRepo.saveAll(users);
    }
}
