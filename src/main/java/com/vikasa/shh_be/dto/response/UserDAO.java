package com.vikasa.shh_be.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

@Getter
@AllArgsConstructor
public class UserDAO {
    private String id;
    private String sex;
    private byte age;
    private String name;
    private BigDecimal latitude;
    private BigDecimal longitude;
    private Boolean isActive;
    private ZonedDateTime createdAt;
    private ZonedDateTime updatedAt;
}
