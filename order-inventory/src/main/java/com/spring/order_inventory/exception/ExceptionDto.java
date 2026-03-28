package com.spring.order_inventory.exception;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Lazy;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Getter
@Setter
@Lazy
public class ExceptionDto {
    private String timeStamp;
    private int status;
    private String error;
    private String message;
    private String path;

    public ExceptionDto(int status, String error, String message, String path) {
        this.timeStamp= LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        this.status = status;
        this.error = error;
        this.message = message;
        this.path = path;
    }
}
