package com.knits.product.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "office")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Office extends BaseEntity implements Serializable {
    @ManyToOne
    private Country country;
    private String city;
    private String postalCode;
    private String street;
}
