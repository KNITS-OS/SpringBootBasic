package com.knits.product.service.office.dto;

import com.knits.product.service.user.dto.BaseEntityDto;
import lombok.Data;

import java.io.Serializable;

@Data
public class OfficeDto extends BaseEntityDto implements Serializable {
    private Long countryId;
    private String city;
    private String postalCode;
    private String street;
}
