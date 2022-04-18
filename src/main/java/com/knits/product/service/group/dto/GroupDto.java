package com.knits.product.service.group.dto;

import com.knits.product.service.user.dto.BaseEntityDto;
import lombok.Data;

import java.io.Serializable;

@Data
public class GroupDto extends BaseEntityDto implements Serializable {
    private Long id;
    private String name;
    private boolean active;
    private String description;
}
