package com.knits.product.service.base;

import com.knits.product.model.BaseEntity;
import com.knits.product.repository.BaseEntityRepository;
import com.knits.product.service.base.mapper.BaseEntityMapper;
import com.knits.product.service.user.dto.BaseEntityDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.function.Function;

@RequiredArgsConstructor
@Slf4j
public abstract class BaseEntityService<E extends BaseEntity, D extends BaseEntityDto> {
    private final BaseEntityRepository<E> repository;
    private final BaseEntityMapper<E, D> mapper;

    public D save(D dto) {
        log.debug("Request to save DTO={}", dto);
        return applyToEntity(mapper.toEntity(dto), null);
    }

    public D partialUpdate(D dto) {
        log.debug("Request to partially update DTO={}", dto);
        return applyToEntity(findByIdOrThrowException(dto.getId()), e -> mapper.partialUpdate(e, dto));
    }

    public D update(D dto) {
        return applyToEntity(findByIdOrThrowException(dto.getId()), e -> mapper.update(e, dto));
    }

    public D findById(Long id) {
        log.debug("Requested DTO by id={}", id);
        E entity = findByIdOrThrowException(id);
        return mapper.toDto(entity);
    }

    public void delete(D dto) {
        deleteById(dto.getId());
    }

    public void deleteById(Long id) {
        log.debug("Delete entity by id={}", id);
        repository.deleteById(id);
    }

    public List<D> findAll() {
        return mapper.toDto(repository.findAll());
    }

    public Page<D> findAll(Pageable pageable) {
        return repository.findAll(pageable).map(mapper::toDto);
    }

    private D applyToEntity(E entity, Function<? super E, ? extends E> functionToApply) {
        if (functionToApply != null) {
            entity = functionToApply.apply(entity);
        }
        entity = repository.save(entity);
        log.debug("Changes applied to entity={}", entity);
        return mapper.toDto(entity);
    }

    public E findByIdOrThrowException(Long id) {
        return repository.findById(id).orElseThrow(EntityNotFoundException::new);
    }
}
