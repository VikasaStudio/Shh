package com.vikasa.shh_be.mapper;

import com.vikasa.shh_be.dto.response.UserDAO;
import com.vikasa.shh_be.exceptions.ErrorDetails;
import com.vikasa.shh_be.model.User;
import jakarta.annotation.Nullable;
import lombok.SneakyThrows;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;
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
