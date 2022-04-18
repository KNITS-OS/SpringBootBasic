package com.knits.product.service.country;

import com.knits.product.model.Country;
import com.knits.product.repository.BaseEntityRepository;
import com.knits.product.repository.CountryRepository;
import com.knits.product.service.base.BaseEntityService;
import com.knits.product.service.base.mapper.BaseEntityMapper;
import com.knits.product.service.country.dto.CountryDto;
import com.knits.product.service.country.mapper.CountryMapper;
import org.springframework.stereotype.Service;

@Service
public class CountryService extends BaseEntityService<Country, CountryDto> {
    public CountryService(CountryRepository repository, CountryMapper mapper) {
        super(repository, mapper);
    }
}
