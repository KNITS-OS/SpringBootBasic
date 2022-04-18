package com.knits.product.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Base entity, that contains sequence generator by default to be used in subclasses.
 */

@MappedSuperclass
@Getter
@Setter
public abstract class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
