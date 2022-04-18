package com.knits.product.service.unit.dto;

import com.knits.product.service.user.dto.BaseEntityDto;
import lombok.Data;

import java.io.Serializable;

@Data
public class BusinessUnitDto extends BaseEntityDto implements Serializable {
    private String name;
}
