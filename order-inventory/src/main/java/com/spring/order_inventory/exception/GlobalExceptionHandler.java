package com.spring.order_inventory.exception;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ResponseBody
    @ExceptionHandler(IdNotFoundException.class)
    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    public ResponseEntity<ExceptionDto> IdNotFoundException(IdNotFoundException e, HttpServletRequest request){
       ExceptionDto exceptionDto = new ExceptionDto(404,"NOT_FOUND",e.getMessage(),request.getRequestURI());
        return new ResponseEntity<>(exceptionDto,HttpStatus.NOT_FOUND);
    }

    @ResponseBody
    @ExceptionHandler(InvalidFormatException.class)
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    public ResponseEntity<ExceptionDto> InvalidFormatException(InvalidFormatException e, HttpServletRequest request){
        ExceptionDto exceptionDto = new ExceptionDto(400,"BAD_REQUEST",e.getMessage(),request.getRequestURI());
        return new ResponseEntity<>(exceptionDto,HttpStatus.BAD_REQUEST);
    }


}
