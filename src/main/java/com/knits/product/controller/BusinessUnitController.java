package com.knits.product.controller;

import com.knits.product.model.BusinessUnit;
import com.knits.product.service.base.BaseEntityService;
import com.knits.product.service.unit.BusinessUnitService;
import com.knits.product.service.unit.dto.BusinessUnitDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/businessUnits")
public class BusinessUnitController extends BaseEntityController<BusinessUnit, BusinessUnitDto> {
    public BusinessUnitController(BusinessUnitService service) {
        super(service);
    }
}
