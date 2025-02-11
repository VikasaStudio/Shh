package com.vikasa.shh_be.controllers;

import com.vikasa.shh_be.entity.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @PostMapping("/user")
    void createUser(@RequestBody User user) {
        System.out.println(user);
    }

}
