package com.knits.product.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Base entity, that contains sequence generator by default to be used in subclasses.
 */

@MappedSuperclass
@Getter
@Setter
public abstract class BaseEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
