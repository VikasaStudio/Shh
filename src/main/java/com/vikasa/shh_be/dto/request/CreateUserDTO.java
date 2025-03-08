package com.vikasa.shh_be.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import javax.swing.text.html.Option;
import java.math.BigDecimal;
import java.time.ZonedDateTime;

@Getter
@AllArgsConstructor
@ToString
public class CreateUserDTO {
    private String sex;
    private byte age;
    private String name;
    private String secret;
    private BigDecimal latitude;
    private BigDecimal longitude;
}
