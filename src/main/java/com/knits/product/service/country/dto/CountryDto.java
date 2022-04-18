package com.knits.product.service.country.dto;

import com.knits.product.service.user.dto.BaseEntityDto;
import lombok.Data;

@Data
public class CountryDto extends BaseEntityDto {
    private String code;
    private String codeIso3;
    private String name;
    private String number;
}
