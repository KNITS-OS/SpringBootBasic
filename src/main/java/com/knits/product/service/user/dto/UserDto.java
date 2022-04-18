package com.knits.product.service.user.dto;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
public class UserDto extends BaseEntityDto implements Serializable {
    private String login;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private Boolean active;
}
