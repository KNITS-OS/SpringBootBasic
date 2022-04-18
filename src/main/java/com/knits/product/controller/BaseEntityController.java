package com.knits.product.controller;

import com.knits.product.model.BaseEntity;
import com.knits.product.service.base.BaseEntityService;
import com.knits.product.service.user.dto.BaseEntityDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@Slf4j
public abstract class BaseEntityController<T extends BaseEntity, D extends BaseEntityDto> {
    private final BaseEntityService<T, D> service;

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<D> findById(@PathVariable final Long id) {
        log.debug("REST request to get entity by ID={}", id);
        D dto = service.findById(id);
        return ResponseEntity
                .ok()
                .body(dto);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<D>> all() {
        log.debug("REST request to get all entities");
        return ResponseEntity.ok().body(service.findAll());
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<D> create(@RequestBody D dto) {
        log.debug("REST request to create entity={}", dto);
        if (dto == null) {
            throw new RuntimeException();
        }
        return ResponseEntity.ok()
                             .body(service.save(dto));
    }

    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<D> update(@RequestBody D dto) {
        log.debug("REST request to update entity={}", dto);
        if (dto == null) {
            throw new RuntimeException();
        }
        return ResponseEntity.ok().body(service.update(dto));
    }

    @PatchMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<D> updatePartially(@PathVariable(value = "id", required = false) final Long id, @RequestBody D dto) {
        log.debug("REST request to partially update entity={}", dto);

        if (dto == null) {
            throw new RuntimeException();
        }
        dto.setId(id);

        return ResponseEntity
                .ok()
                .body(service.partialUpdate(dto));
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        log.debug("REST request to delete entity by id={}", id);
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
