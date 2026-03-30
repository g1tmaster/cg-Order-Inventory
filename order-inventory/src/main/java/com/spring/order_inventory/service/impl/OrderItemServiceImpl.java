package com.spring.order_inventory.service.impl;

import com.spring.order_inventory.dto.OrderItemResponseDto;
import com.spring.order_inventory.entity.OrderItem;
import com.spring.order_inventory.repository.OrderItemRepository;
import com.spring.order_inventory.service.IOrderItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class OrderItemServiceImpl implements IOrderItemService {
    private final OrderItemRepository orderItemRepository;

    @Override
    public List<OrderItemResponseDto> getAllOrderItemsWithDetails() {
        return List.of();
    }

    @Override
    public List<OrderItemResponseDto> getOrderItemsByOrderId(Integer orderId) {
        return List.of();
    }

    public List<OrderItemResponseDto> getOrderByShipmentId(Integer shipmentId) {
        List<OrderItem> items = orderItemRepository.findByShipmentShipmentId(shipmentId);

        return items.stream()
                .map(item -> OrderItemResponseDto.builder()
                        .orderId(item.getLineItemId())
                        .productId(item.getProduct().getProductId())
                        .productName(item.getProduct().getProductName())
                        .quantity(item.getQuantity())
                        .unitPrice(item.getUnitPrice())
                        .build())
                .toList();
    }
}
