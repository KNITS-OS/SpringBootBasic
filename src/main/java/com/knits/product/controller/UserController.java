package com.knits.product.controller;


import com.knits.product.service.dto.UserDTO;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/admin")
public class UserController {

    @GetMapping("/users/{id}")
    public ResponseEntity<UserDTO> getEmployee(@PathVariable Long id) {
        throw new UnsupportedOperationException("not yet implementes");
    }
    @GetMapping("/users")
    public ResponseEntity<List<UserDTO>> getAllEmployees(Pageable pageable){
        throw new UnsupportedOperationException("not yet implementes");
    }

    @PostMapping("/users")
    public ResponseEntity<UserDTO> createUser(@RequestBody UserDTO userDTO){
        throw new UnsupportedOperationException("not yet implementes");
    }

    @PutMapping("/users")
    public ResponseEntity<UserDTO> updateUser( @RequestBody UserDTO userDTO) {
        throw new UnsupportedOperationException("not yet implementes");
    }

    @DeleteMapping("/employees/{id}")
    public ResponseEntity<Void> deleteEmployee(@PathVariable Long id) {
        throw new UnsupportedOperationException("not yet implementes");
    }


}
