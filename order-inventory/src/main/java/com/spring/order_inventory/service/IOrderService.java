package com.spring.order_inventory.service;

import com.spring.order_inventory.dto.OrderResponseDto;
import com.spring.order_inventory.dto.StoreResponseDto;
import java.util.List;

public interface IOrderService {

    OrderResponseDto getOrderById(Integer id);

    StoreResponseDto getStoreByOrderId(Integer orderId);

    List<OrderResponseDto> getOrdersByCustomerId(Integer customerId);

    List<OrderResponseDto> getOrdersByStoreId(Integer storeId);
}