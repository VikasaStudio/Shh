package com.vikasa.shh_be.controllers.v1;

import com.vikasa.shh_be.dto.request.CreateUserDTO;
import com.vikasa.shh_be.dto.request.DeleteUserRequestBody;
import com.vikasa.shh_be.dto.request.UpdateUserDTO;
import com.vikasa.shh_be.dto.response.UserDAO;
import com.vikasa.shh_be.exceptions.ErrorDetails;
import com.vikasa.shh_be.service.v1.UserServiceV1;
import jakarta.validation.Valid;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("/api/v1/user")
public class UserControllerV1 {

    @Autowired
    UserServiceV1 userService;

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    UserDAO createUser(@Valid @RequestBody CreateUserDTO user) {
        System.out.printf("Received create request for %s", user.getSecret());
        return userService.addUser(user);
    }

    @GetMapping()
    Page<UserDAO> getUsers(Pageable pageable) {
        return userService.findAllUsers(pageable);
    }
    @GetMapping("/{userId}")
    UserDAO getUserById(@PathVariable String userId) throws ErrorDetails {
        return userService.getUserById(userId);
    }

    @DeleteMapping()
    void deleteUser(@RequestBody DeleteUserRequestBody user) {
        userService.deleteUsers(user.getUserIDs());
    }

    @PatchMapping("/{userId}")
    void updateUser(@PathVariable("userId") String userId, @RequestBody UpdateUserDTO user) throws ErrorDetails {
        userService.updateUser(userId, user);
    }
}
