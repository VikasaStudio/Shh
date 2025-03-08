package com.vikasa.shh_be.dto.request;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class UserDTO {
    private String sex;
    private byte age;
    private String name;
    private String secret;
    private BigDecimal latitude;
    private BigDecimal longitude;
}
