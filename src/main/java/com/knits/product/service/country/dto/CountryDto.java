package com.knits.product.service.country.dto;

import com.knits.product.service.user.dto.BaseEntityDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CountryDto extends BaseEntityDto {
    private String code;
    private String codeIso3;
    private String name;
    private String number;
}
