package com.knits.product.service.dto;

import com.knits.product.exceptions.AppException;
import com.knits.product.exceptions.SystemException;
import lombok.Data;

@Data
public class ExceptionDto {

    private int code;
    private String message;

    public static final int UNMAPPED_EXCEPTION_CODE=-1024;
    public static final String INTERNAL_EX_MESSAGE="Internal System Exception. Contact administrator if problem persists";

    public ExceptionDto(){ }

    public ExceptionDto(Exception e){
        setCode(UNMAPPED_EXCEPTION_CODE);
        setMessage(INTERNAL_EX_MESSAGE);
    }

    public ExceptionDto(AppException e){
        setCode(e.getCode());
        setMessage(e.getMessage());
    }

    public ExceptionDto(SystemException e){
        setCode(e.getCode());
        setMessage(INTERNAL_EX_MESSAGE);
    }
}
