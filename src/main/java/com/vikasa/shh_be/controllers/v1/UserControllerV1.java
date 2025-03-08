package com.vikasa.shh_be.controllers.v1;

import com.vikasa.shh_be.dto.request.CreateUserDTO;
import com.vikasa.shh_be.dto.request.DeleteUserRequestBody;
import com.vikasa.shh_be.dto.response.UserDAO;
import com.vikasa.shh_be.model.User;
import com.vikasa.shh_be.service.v1.UserServiceV1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("/api/v1/user")
public class UserControllerV1 {

    @Autowired
    UserServiceV1 userService;

    @PostMapping()
    UserDAO createUser(@RequestBody CreateUserDTO user) {
        System.out.printf("Received create request for %s", user.getSecret());
        return userService.addUser(user);
    }

    @GetMapping("/{userId}")
    UserDAO getUserById(@PathVariable String userId) {
        return userService.getUserById(userId);
    }

    @DeleteMapping()
    void deleteUser(@RequestBody DeleteUserRequestBody user) {
        userService.deleteUsers(user.getUserIDs());
    }

}
