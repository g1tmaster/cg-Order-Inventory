package com.spring.order_inventory.service.impl;

import com.spring.order_inventory.dto.OrderItemResponseDto;
import com.spring.order_inventory.entity.OrderItem;
import com.spring.order_inventory.mapper.OrderItemMapper;
import com.spring.order_inventory.repository.OrderItemRepository;
import com.spring.order_inventory.service.IOrderItemService;
import com.spring.order_inventory.service.IOrderItemService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderItemServiceImpl implements IOrderItemService {

    @Autowired
    private OrderItemRepository orderItemRepository;

    @Override
    public List<OrderItemResponseDto> getAllOrderItemDetails() {
        List<Object[]> rows = orderItemRepository.findAllOrderItemsRaw();

        return rows.stream().map(row -> {
            OrderItemResponseDto dto = new OrderItemResponseDto();
            dto.setLineItemId((Integer) row[0]);
            dto.setOrderId((Integer) row[1]);
            dto.setProductId((Integer) row[2]);
            dto.setProductName((String) row[3]);
            dto.setUnitPrice(((Number) row[4]).doubleValue());
            dto.setQuantity((Integer) row[5]);
            dto.setShipmentId(row[6] != null ? (Integer) row[6] : null);
            return dto;
        }).toList();
    }

    @Override
    public List<OrderItemResponseDto> getByShipmentId(Integer shipmentId) {
        List<Object[]> rows = orderItemRepository.findAllByShipmentRaw(shipmentId);

        return rows.stream().map(row -> {
            OrderItemResponseDto dto = new OrderItemResponseDto();
            dto.setLineItemId((Integer) row[0]);
            dto.setOrderId((Integer) row[1]);
            dto.setProductId((Integer) row[2]);
            dto.setProductName((String) row[3]);
            dto.setShipmentId((Integer) row[4]);
            dto.setUnitPrice(((Number) row[5]).doubleValue());
            dto.setQuantity((Integer) row[6]);
            return dto;
        }).toList();
    }

    @Override
    public List<OrderItemResponseDto> getByOrderId(Integer orderId) {
        return orderItemRepository.findByOrder_OrderId(orderId)
                .stream()
                .map(OrderItemMapper::toDTO)
                .collect(Collectors.toList());
    }
}