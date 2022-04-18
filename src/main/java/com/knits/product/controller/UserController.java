package com.knits.product.controller;


import com.knits.product.model.User;
import com.knits.product.service.base.BaseEntityService;
import com.knits.product.service.user.dto.UserDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
@Slf4j
public class UserController extends BaseEntityController<User, UserDto> {
    public UserController(BaseEntityService<User, UserDto> service) {
        super(service);
    }
}
