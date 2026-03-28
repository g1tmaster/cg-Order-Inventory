package com.spring.order_inventory.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class OrderItemResponseDTO {
	private Integer orderItemId;

    private Integer productId;
    private String productName;

    private Integer quantity;
    private Double price;
}
