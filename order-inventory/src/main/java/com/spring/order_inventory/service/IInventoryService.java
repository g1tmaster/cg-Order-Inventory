package com.spring.order_inventory.service;

import com.spring.order_inventory.dto.InventoryResponseDto;
import java.util.List;

public interface IInventoryService {

    List<InventoryResponseDto> getInventoryByStoreId(Integer storeId);

    List<InventoryResponseDto> getInventoryByProductId(Integer productId);
}