package com.spring.order_inventory.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ShipmentResponseDto {

    private Integer shipmentId;
    private String shipmentStatus;
    private String deliveryAddress;
}
