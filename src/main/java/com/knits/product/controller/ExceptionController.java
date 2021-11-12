package com.knits.product.controller;

import com.knits.product.exceptions.AppException;
import com.knits.product.exceptions.SystemException;
import com.knits.product.exceptions.UserException;
import com.knits.product.service.dto.ExceptionDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
@Slf4j
public class ExceptionController {


    @ExceptionHandler(UserException.class)
    @ResponseBody
    public ResponseEntity<ExceptionDto> handleUserException(UserException ex) {
        return wrapIntoResponseEntity(ex, HttpStatus.NOT_ACCEPTABLE);
    }

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResponseEntity<ExceptionDto> handleAllException(Exception ex) {
        return wrapIntoResponseEntity(ex, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    private ResponseEntity<ExceptionDto> wrapIntoResponseEntity (Exception ex, HttpStatus status){
        log.error(ex.getMessage(),ex);
        return ResponseEntity
                .status(status)
                .body(new ExceptionDto(ex));
    }

}
