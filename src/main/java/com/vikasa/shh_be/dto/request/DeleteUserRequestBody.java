package com.vikasa.shh_be.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter
public class DeleteUserRequestBody {
    List<String> userIDs;
}
