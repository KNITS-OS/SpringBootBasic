package com.knits.product.service.unit;

import com.knits.product.model.BusinessUnit;
import com.knits.product.repository.BaseEntityRepository;
import com.knits.product.repository.BusinessUnitRepository;
import com.knits.product.service.base.BaseEntityService;
import com.knits.product.service.base.mapper.BaseEntityMapper;
import com.knits.product.service.unit.dto.BusinessUnitDto;
import com.knits.product.service.unit.mapper.BusinessUnitMapper;
import org.springframework.stereotype.Service;

@Service
public class BusinessUnitService extends BaseEntityService<BusinessUnit, BusinessUnitDto> {
    public BusinessUnitService(BusinessUnitRepository repository,
                               BusinessUnitMapper mapper) {
        super(repository, mapper);
    }
}
