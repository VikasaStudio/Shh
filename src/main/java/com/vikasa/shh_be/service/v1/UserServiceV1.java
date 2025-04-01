package com.vikasa.shh_be.service.v1;

import com.vikasa.shh_be.dto.request.CreateUserDTO;
import com.vikasa.shh_be.dto.request.UpdateUserDTO;
import com.vikasa.shh_be.dto.response.UserDAO;
import com.vikasa.shh_be.exceptions.ErrorDetails;
import com.vikasa.shh_be.mapper.CreateUserDTOToUserMapper;
import com.vikasa.shh_be.mapper.UserToUserDTOMapper;
import com.vikasa.shh_be.model.User;
import com.vikasa.shh_be.repository.v1.UserRepositoryV1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.Date;
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

    public UserDAO getUserById(String id) throws ErrorDetails {
        Optional<User> obj = userRepo.findById(id);
        if(obj.isEmpty()) {
            throw new ErrorDetails(new Date(), "Failed to update User, as not found", "User with given ID cant be updated", HttpStatus.NOT_FOUND);
        }
        return userToUserDTOMapper.apply(obj.get());
    }

    public UserDAO addUser(CreateUserDTO usr) {
        User obj = userRepo.save(createUserToUserMapper.apply(usr));
        return userToUserDTOMapper.apply(obj);
    }

    public UserDAO updateUser(String id, UpdateUserDTO usr) throws ErrorDetails {
        Optional<User> obj = userRepo.findById(id);
        if(obj.isEmpty()) {
            throw new ErrorDetails(new Date(), "Failed to update User, as not found", "User with given ID cant be updated", HttpStatus.BAD_REQUEST);
        }

        User user = obj.get();
        user.setName(usr.getName());
        user.setSecret(usr.getSecret());
        user.setAge(usr.getAge());
        user.setLatitude(usr.getLatitude());
        user.setLongitude(usr.getLongitude());
        userRepo.saveAndFlush(user);
        return userToUserDTOMapper.apply(user);
    }
    public void deleteUsers(List<String> ids) {
        List<User> users = userRepo.findAllById(ids);
        users.forEach(user -> {
            user.setIsActive(false);
        });
        userRepo.saveAll(users);
    }
}
