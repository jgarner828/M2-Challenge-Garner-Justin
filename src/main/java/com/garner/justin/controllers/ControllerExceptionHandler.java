package com.garner.justin.controllers;


import com.garner.justin.model.CustomErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(value = {IllegalArgumentException.class})
    @ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
    public ResponseEntity<CustomErrorResponse> handleOutOfRange(IllegalArgumentException e) {
        CustomErrorResponse error = new CustomErrorResponse(HttpStatus.UNPROCESSABLE_ENTITY.toString(), e.getMessage());
        error.setTimestamp(LocalDateTime.now());
        error.setStatus(HttpStatus.UNPROCESSABLE_ENTITY.value());
        ResponseEntity<CustomErrorResponse> responseEntity = new ResponseEntity<>(error, HttpStatus.UNPROCESSABLE_ENTITY);
        return responseEntity;
    }

    @ExceptionHandler(value = {IndexOutOfBoundsException.class})
    @ResponseStatus(HttpStatus.MOVED_PERMANENTLY)
    public ResponseEntity<CustomErrorResponse> handleIndexOutofBounds(IndexOutOfBoundsException e) {
        CustomErrorResponse error = new CustomErrorResponse(HttpStatus.MOVED_PERMANENTLY.toString(), e.getMessage());
        error.setTimestamp(LocalDateTime.now());
        error.setStatus(HttpStatus.MOVED_PERMANENTLY.value());
        ResponseEntity<CustomErrorResponse> responseEntity = new ResponseEntity<>(error, HttpStatus.MOVED_PERMANENTLY);
        return responseEntity;
    }

    @ExceptionHandler(value = {ArithmeticException.class})
    @ResponseStatus(HttpStatus.NOT_ACCEPTABLE)
    public ResponseEntity<CustomErrorResponse> foursAreBadNoMath(ArithmeticException e) {
        CustomErrorResponse error = new CustomErrorResponse(HttpStatus.NOT_ACCEPTABLE.toString(), e.getMessage());
        error.setTimestamp(LocalDateTime.now());
        error.setStatus(HttpStatus.NOT_ACCEPTABLE.value());
        ResponseEntity<CustomErrorResponse> responseEntity = new ResponseEntity<>(error, HttpStatus.NOT_ACCEPTABLE);
        return responseEntity;
    }


}
