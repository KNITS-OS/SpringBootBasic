package com.knits.product.service.dto;

import lombok.Data;

@Data
public class UserDTO {

    private Long id;
    private String login;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private boolean active = false;
}
