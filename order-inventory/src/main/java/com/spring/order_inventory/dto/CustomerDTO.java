package com.spring.order_inventory.dto;

import lombok.Data;

@Data
public class CustomerDTO {

    private Long customerId;
    private String fullName;
    private String email;
}