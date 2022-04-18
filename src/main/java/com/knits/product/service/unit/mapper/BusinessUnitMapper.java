package com.knits.product.service.unit.mapper;

import com.knits.product.model.BusinessUnit;
import com.knits.product.service.base.mapper.BaseEntityMapper;
import com.knits.product.service.unit.dto.BusinessUnitDto;
import com.knits.product.util.MapperUtil;
import org.springframework.stereotype.Component;

@Component
public class BusinessUnitMapper implements BaseEntityMapper<BusinessUnit, BusinessUnitDto> {
    @Override
    public BusinessUnit toEntity(BusinessUnitDto dto) {
        if (dto == null) {
            return null;
        }
        return map(dto, BusinessUnit.class);
    }

    @Override
    public BusinessUnitDto toDto(BusinessUnit entity) {
        if (entity == null) {
            return null;
        }
        return map(entity, BusinessUnitDto.class);
    }

    @Override
    public BusinessUnit partialUpdate(BusinessUnit entity, BusinessUnitDto dto) {
        if (dto == null) {
            return entity;
        }
        MapperUtil.getPartialMapper().map(dto, entity);
        return entity;
    }

    @Override
    public BusinessUnit update(BusinessUnit entity, BusinessUnitDto dto) {
        if (dto == null) {
            return entity;
        }
        getMapper().map(dto, entity);
        return entity;
    }
}
