package com.example.demo.exception;

import com.example.demo.dto.ErrorMessage;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Log4j2
@RestControllerAdvice
public class GeneralExceptionHandler {
    private static final String GENERIC_ERROR_MESSAGE = "something went wrong";

    @ExceptionHandler
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ErrorMessage handleGlobalException (Exception message){
        return new ErrorMessage(message.getMessage());
    }
}
