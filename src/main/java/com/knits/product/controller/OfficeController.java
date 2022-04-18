package com.knits.product.controller;

import com.knits.product.model.Office;
import com.knits.product.service.base.BaseEntityService;
import com.knits.product.service.office.OfficeService;
import com.knits.product.service.office.dto.OfficeDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/offices")
public class OfficeController extends BaseEntityController<Office, OfficeDto> {
    public OfficeController(OfficeService service) {
        super(service);
    }
}
