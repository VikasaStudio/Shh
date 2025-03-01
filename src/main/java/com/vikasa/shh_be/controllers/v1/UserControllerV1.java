package com.vikasa.shh_be.controllers.v1;

import com.vikasa.shh_be.model.User;
import com.vikasa.shh_be.service.v1.UserServiceV1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("/api/v1/users")
public class UserControllerV1 {

    @Autowired
    UserServiceV1 userService;

    @PostMapping()
    void createUser(@RequestBody User user) {
        System.out.println(user);
        userService.addUser(user);
    }

    @DeleteMapping()
    void deleteUser(@RequestBody User user) {
        System.out.println(user);
        userService.addUser(user);
    }

}
