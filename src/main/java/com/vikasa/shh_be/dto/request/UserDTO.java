package com.vikasa.shh_be.dto.request;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;
import org.springframework.validation.annotation.Validated;
import org.springframework.validation.ValidationUtils.*;
import java.math.BigDecimal;

@Getter
@Setter
@Validated
public class UserDTO {


    @NotNull(message = "missing required field 'sex'")
    @Pattern(regexp = "^(male|female)$", message = "sex must be either male or female")
    private String sex;

    private byte age;
    private String name;
    private String secret;
    private BigDecimal latitude;
    private BigDecimal longitude;
}
