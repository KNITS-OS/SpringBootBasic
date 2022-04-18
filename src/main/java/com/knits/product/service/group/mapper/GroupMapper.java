package com.knits.product.service.group.mapper;

import com.knits.product.model.Group;
import com.knits.product.service.base.mapper.BaseEntityMapper;
import com.knits.product.service.group.dto.GroupDto;
import com.knits.product.util.MapperUtil;
import org.springframework.stereotype.Component;

@Component
public class GroupMapper implements BaseEntityMapper<Group, GroupDto> {
    @Override
    public Group toEntity(GroupDto dto) {
        if (dto == null) {
            return null;
        }
        return map(dto, Group.class);
    }

    @Override
    public GroupDto toDto(Group entity) {
        if (entity == null) {
            return null;
        }
        return map(entity, GroupDto.class);
    }

    @Override
    public Group partialUpdate(Group entity, GroupDto dto) {
        if (dto == null) {
            return entity;
        }
        MapperUtil.getPartialMapper().map(dto, entity);
        return entity;
    }

    @Override
    public Group update(Group entity, GroupDto dto) {
        if (dto == null) {
            return entity;
        }
        getMapper().map(dto, entity);
        return entity;
    }
}
