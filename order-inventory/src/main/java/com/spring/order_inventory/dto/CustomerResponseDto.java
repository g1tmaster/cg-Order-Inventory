package com.spring.order_inventory.dto;

import lombok.Data;

@Data
public class CustomerResponseDto {

    private Integer customerId;
    private String fullName;
    private String email;
}