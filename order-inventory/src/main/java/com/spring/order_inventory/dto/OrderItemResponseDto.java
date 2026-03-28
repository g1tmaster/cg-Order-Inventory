package com.spring.order_inventory.dto;

import lombok.Data;

@Data
public class OrderItemResponseDto {

    private Integer lineItemId;

    // Order details
    private Integer orderId;

    // Product details
    private Integer productId;
    private String productName;

    // Shipment details
    private Integer shipmentId;

    private Double unitPrice;
    private Integer quantity;
}
