package com.spring.order_inventory.service.impl;

import com.spring.order_inventory.dto.InventoryResponseDto;
import com.spring.order_inventory.service.IInventoryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryServiceImpl implements IInventoryService {
    @Override
    public List<InventoryResponseDto> getInventoryByStoreId(Integer storeId) {
        return List.of();
    }

    @Override
    public List<InventoryResponseDto> getInventoryByProductId(Integer productId) {
        return List.of();
    }
}
