package com.spring.order_inventory.service;

import com.spring.order_inventory.dto.OrderItemResponseDto;
import java.util.List;

public interface IOrderItemService {

    List<OrderItemResponseDto> getAllOrderItemsWithDetails();

    List<OrderItemResponseDto> getOrderItemsByOrderId(Integer orderId);

    List<OrderItemResponseDto> getOrderByShipmentId(Integer shipmentId);
}