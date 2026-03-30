package com.spring.order_inventory.dto;

import lombok.Data;

@Data
public class OrderItemResponseDto {

    private Integer lineItemId;
    private Integer orderId;
    private Integer productId;
    private String productName;
    private Integer shipmentId;
    private Double unitPrice;
    private Integer quantity;
}