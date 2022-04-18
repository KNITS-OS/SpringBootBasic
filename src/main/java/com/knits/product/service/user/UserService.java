package com.knits.product.service.user;

import com.knits.product.model.User;
import com.knits.product.repository.BaseEntityRepository;
import com.knits.product.repository.UserRepository;
import com.knits.product.service.base.BaseEntityService;
import com.knits.product.service.base.mapper.BaseEntityMapper;
import com.knits.product.service.user.dto.UserDto;
import com.knits.product.service.user.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service for managing {@link com.knits.product.model.User}.
 */
@Service
@Transactional
@Slf4j
public class UserService extends BaseEntityService<User, UserDto> {
    public UserService(UserRepository repository, UserMapper mapper) {
        super(repository, mapper);
    }
}
