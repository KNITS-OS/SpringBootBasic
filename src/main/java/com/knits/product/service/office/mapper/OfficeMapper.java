package com.knits.product.service.office.mapper;

import com.knits.product.model.Office;
import com.knits.product.service.base.mapper.BaseEntityMapper;
import com.knits.product.service.office.dto.OfficeDto;
import com.knits.product.util.MapperUtil;
import org.springframework.stereotype.Component;

@Component
public class OfficeMapper implements BaseEntityMapper<Office, OfficeDto> {
    @Override
    public Office toEntity(OfficeDto dto) {
        if (dto == null) {
            return null;
        }
        return map(dto, Office.class);
    }

    @Override
    public OfficeDto toDto(Office entity) {
        if (entity == null) {
            return null;
        }
        return map(entity, OfficeDto.class);
    }

    @Override
    public Office partialUpdate(Office entity, OfficeDto dto) {
        if (dto == null) {
            return entity;
        }
        MapperUtil.getPartialMapper().map(dto, entity);
        return entity;
    }

    @Override
    public Office update(Office entity, OfficeDto dto) {
        if (dto == null) {
            return null;
        }
        getMapper().map(dto, entity);
        return entity;
    }
}
