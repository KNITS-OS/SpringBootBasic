package com.knits.product.service.user.mapper;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.knits.product.model.User;
import com.knits.product.service.base.mapper.BaseEntityMapper;
import com.knits.product.service.user.dto.UserDto;
import com.knits.product.util.MapperUtil;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class UserMapper implements BaseEntityMapper<User, UserDto> {
    @Override
    public User toEntity(UserDto dto) {
        if (dto == null) {
            return null;
        }
        return map(dto, User.class);
    }

    @Override
    public UserDto toDto(User entity) {
        if (entity == null) {
            return null;
        }
        return map(entity, UserDto.class);
    }

    @Override
    public User partialUpdate(User entity, UserDto dto) {
        if (dto == null) {
            return entity;
        }
        MapperUtil.getPartialMapper().map(dto, entity);
        return entity;
    }

    @Override
    public User update(User entity, UserDto dto) {
        if (dto == null) {
            return entity;
        }
        getMapper().map(dto, entity);
        return entity;
    }
}
