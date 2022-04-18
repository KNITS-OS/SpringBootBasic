package com.knits.product.service.country.mapper;

import com.knits.product.model.Country;
import com.knits.product.service.base.mapper.BaseEntityMapper;
import com.knits.product.service.country.dto.CountryDto;
import com.knits.product.util.MapperUtil;
import org.springframework.stereotype.Component;

@Component
public class CountryMapper implements BaseEntityMapper<Country, CountryDto> {
    @Override
    public Country toEntity(CountryDto dto) {
        if (dto == null) {
            return null;
        }
        return map(dto, Country.class);
    }

    @Override
    public CountryDto toDto(Country entity) {
        if (entity == null) {
            return null;
        }
        return map(entity, CountryDto.class);
    }

    @Override
    public Country partialUpdate(Country entity, CountryDto dto) {
        if (dto == null) {
            return null;
        }
        MapperUtil.getPartialMapper().map(dto, entity);
        return entity;
    }

    @Override
    public Country update(Country entity, CountryDto dto) {
        if (dto == null) {
            return null;
        }
        getMapper().map(dto, entity);
        return entity;
    }
}
