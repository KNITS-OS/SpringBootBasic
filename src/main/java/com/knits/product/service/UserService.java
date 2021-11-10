package com.knits.product.service;

import com.knits.product.service.dto.UserDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * Service for managing {@link com.knits.product.model.User}.
 */
@Service
@Transactional
public class UserService {
    /**
     * Save a employee.
     *
     * @param userDTO the entity to save.
     * @return the persisted entity.
     */
    public UserDTO save(UserDTO userDTO){
        throw new UnsupportedOperationException("not yet implementes");
    }

    /**
     * Partially updates a user.
     *
     * @param userDTO the entity to update partially.
     * @return the persisted entity.
     */
    Optional<UserDTO> partialUpdate(UserDTO userDTO){
        throw new UnsupportedOperationException("not yet implementes");
    }
    /**
     * Get all the users.
     *
     * @param pageable the pagination information.
     * @return the list of entities.
     */
    Page<UserDTO> findAll(Pageable pageable){
        throw new UnsupportedOperationException("not yet implementes");
    }

    /**
     * Get by the "id" user.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<UserDTO> findOne(Long id){
        throw new UnsupportedOperationException("not yet implementes");
    }

    /**
     * Delete the "id" user.
     *
     * @param id the id of the entity.
     */
    void delete(Long id){
        throw new UnsupportedOperationException("not yet implementes");
    }
}
