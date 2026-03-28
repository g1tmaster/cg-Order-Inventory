package com.spring.order_inventory.config;
import com.spring.order_inventory.entity.Inventory;
import com.spring.order_inventory.dto.InventoryResponseDto;

public class CustomMapper {
    static InventoryResponseDto inventoryToDto(Inventory inventory){
        return new InventoryResponseDto(inventory.getInventoryId(), inventory.getStore(),inventory.getProduct(), inventory.getQuantity());
    }
}
