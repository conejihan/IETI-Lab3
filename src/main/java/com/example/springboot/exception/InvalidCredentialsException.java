package com.example.springboot.exception;

import com.example.springboot.data.ErrorCodeEnum;
import com.example.springboot.dto.ServerErrorResponseDto;
import org.springframework.http.HttpStatus;

import javax.ws.rs.InternalServerErrorException;

public class InvalidCredentialsException extends InternalServerErrorException {
    public InvalidCredentialsException() {
        super();
        new ServerErrorResponseDto("User not found", ErrorCodeEnum.USER_NOT_FOUND, HttpStatus.NOT_FOUND);

    }
}
