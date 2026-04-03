package com.spring.order_inventory.service;

import  com.spring.order_inventory.dto.InventoryDetailsDto;


import java.util.List;

public interface IInventoryService {

    List<InventoryDetailsDto> findByStoreId(Integer storeId);

    List<InventoryDetailsDto> findByProductId(Integer productId);
}