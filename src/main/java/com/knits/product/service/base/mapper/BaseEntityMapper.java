package com.knits.product.service.base.mapper;

import com.knits.product.util.MapperUtil;
import org.modelmapper.ModelMapper;
import org.springframework.ui.ModelMap;

import java.util.List;
import java.util.stream.Collectors;

public interface BaseEntityMapper<E, D> {
    E toEntity(D dto);

    D toDto(E entity);

    E partialUpdate(E entity, D dto);

    E update(E entity, D dto);

    default List<D> toDto(List<E> entities) {
        if (entities == null) {
            return null;
        }

        return entities.stream()
                       .map(this::toDto)
                       .collect(Collectors.toList());
    }

    default List<E> toEntity(List<D> dtos) {
        if (dtos == null) {
            return null;
        }

        return dtos.stream()
                   .map(this::toEntity)
                   .collect(Collectors.toList());
    }

    default ModelMapper getMapper() {
        return new ModelMapper();
    }

    default <M> M map(Object source, Class<M> destination) {
        return new ModelMapper().map(source, destination);
    }
}
