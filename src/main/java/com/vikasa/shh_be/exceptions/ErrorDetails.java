package com.vikasa.shh_be.exceptions;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;

import java.util.Date;

@Builder
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
public class ErrorDetails extends Exception {
    private Date timestamp;
    private String message;
    private String details;

    @Builder.Default
    private HttpStatusCode statusCode = HttpStatus.INTERNAL_SERVER_ERROR;
}