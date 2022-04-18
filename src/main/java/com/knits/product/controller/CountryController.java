package com.knits.product.controller;

import com.knits.product.model.Country;
import com.knits.product.service.base.BaseEntityService;
import com.knits.product.service.country.CountryService;
import com.knits.product.service.country.dto.CountryDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/countries")
public class CountryController extends BaseEntityController<Country, CountryDto> {
    public CountryController(CountryService service) {
        super(service);
    }
}
