package com.vikasa.shh_be.dto.request;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;
import org.springframework.validation.annotation.Validated;
import java.math.BigDecimal;

@Getter
@Setter
@Validated
public class UserDTO {
    @NotNull(message = "{validation.user.invalid_sex}")
    @Pattern(regexp = "^(male|female)$", message = "{validation.user.invalid_sex}")
    private String sex;

    @Min(value = 18)
    private byte age;

    @NotNull(message = "{validation.user.invalid_name}")
    private String name;

    @NotNull(message = "{validation.user.invalid_secret}")
    private String secret;

    private BigDecimal latitude;
    private BigDecimal longitude;
}
