package com.vikasa.shh_be.mapper;

import com.vikasa.shh_be.dto.request.CreateUserDTO;
import com.vikasa.shh_be.model.User;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class CreateUserDTOToUserMapper implements Function<CreateUserDTO, User> {

    @Override
    public User apply(CreateUserDTO dto) {
        User user = new User();
        user.setName(dto.getName());
        user.setSex(dto.getSex());
        user.setAge(dto.getAge());
        user.setLatitude(dto.getLatitude());
        user.setLongitude(dto.getLongitude());
        user.setIsActive(true);
        user.setSecret(dto.getSecret());
        return user;
    }
}
