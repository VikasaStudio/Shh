package com.vikasa.shh_be.mapper;

import com.vikasa.shh_be.dto.response.UserDAO;
import com.vikasa.shh_be.model.User;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class UserToUserDTOMapper implements Function<User, UserDAO> {
    @Override
    public UserDAO apply(User user) {
        return new UserDAO(
                user.getId(),
                user.getSex(),
                user.getAge(),
                user.getName(),
                user.getLatitude(),
                user.getLongitude(),
                user.getIsActive(),
                user.getCreatedAt(),
                user.getUpdatedAt()
        );
    }
}
