package com.spring.order_inventory.dto;

import com.spring.order_inventory.entity.Product;
import com.spring.order_inventory.entity.Store;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class InventoryResponseDto {
    private Integer inventoryId;
    private Store store;
    private Product product;
    private Integer quantity;

}
