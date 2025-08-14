package com.example.demo.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.demo.exception.DuplicateException;
import com.example.demo.exception.NotFoundException;
import com.example.demo.helper.ErrorCode;
import com.example.demo.response.ErrorResponse;

import lombok.extern.log4j.Log4j2;

@Log4j2
@ControllerAdvice
public class CustomExceptionHandler {
    @ExceptionHandler(DuplicateException.class)
    protected ResponseEntity<ErrorResponse> handleDuplicateException(final DuplicateException e) {
        log.info("DuplicateException", e);

        final ErrorCode errorCode = e.getErrorCode();
        final int status = HttpStatus.CONFLICT.value();

        final ErrorResponse errorResponse = new ErrorResponse(status, errorCode);

        return new ResponseEntity<>(errorResponse, HttpStatus.valueOf(status));
    }

    @ExceptionHandler(NotFoundException.class)
    protected ResponseEntity<ErrorResponse> handleNotFoundException(final NotFoundException e) {
        log.info("NotFoundException", e);

        final ErrorCode errorCode = e.getErrorCode();
        final int status = HttpStatus.CONFLICT.value();

        final ErrorResponse errorResponse = new ErrorResponse(status, errorCode);

        return new ResponseEntity<>(errorResponse, HttpStatus.valueOf(status));
    }

    @ExceptionHandler(Exception.class)
    protected ResponseEntity<ErrorResponse> handleException(Exception e) {
        log.error("Exception", e);

        final int status = HttpStatus.INTERNAL_SERVER_ERROR.value();

        final ErrorResponse response = new ErrorResponse(status, ErrorCode.INTERNAL_SERVER_ERROR);

        return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
