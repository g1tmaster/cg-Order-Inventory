package com.spring.order_inventory.dto;

import lombok.Data;

@Data
public class ShipmentResponseDto {

    private Integer shipmentId;
    private String shipmentStatus;
    private String deliveryAddress;
}
