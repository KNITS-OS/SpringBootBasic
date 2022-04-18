package com.knits.product.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "business_unit")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BusinessUnit extends BaseEntity implements Serializable {
    @Column(length = 128)
    private String name;
}
