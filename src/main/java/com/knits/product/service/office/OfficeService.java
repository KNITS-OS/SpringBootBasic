package com.knits.product.service.office;

import com.knits.product.model.Office;
import com.knits.product.repository.OfficeRepository;
import com.knits.product.service.base.BaseEntityService;
import com.knits.product.service.office.dto.OfficeDto;
import com.knits.product.service.office.mapper.OfficeMapper;
import org.springframework.stereotype.Service;

@Service
public class OfficeService extends BaseEntityService<Office, OfficeDto> {
    public OfficeService(OfficeRepository repository, OfficeMapper mapper) {
        super(repository, mapper);
    }
}
