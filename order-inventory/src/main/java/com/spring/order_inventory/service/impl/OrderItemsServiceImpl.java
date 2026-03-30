package com.spring.order_inventory.service.impl;

import com.spring.order_inventory.dto.OrderItemResponseDto;
import com.spring.order_inventory.entity.OrderItem;
import com.spring.order_inventory.mapper.OrderItemMapper;
import com.spring.order_inventory.repository.OrderItemRepository;
import com.spring.order_inventory.service.IOrderItemsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderItemsServiceImpl implements IOrderItemsService {

    @Autowired
    private OrderItemRepository orderItemRepository;

    @Override
    public List<OrderItemResponseDto> getAllOrderItemDetails() {
        return orderItemRepository.findAll()
                .stream()
                .map(OrderItemMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public List<OrderItemResponseDto> getByShipmentId(Integer shipmentId) {
        return orderItemRepository.findByShipment_ShipmentId(shipmentId)
                .stream()
                .map(OrderItemMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public List<OrderItemResponseDto> getByOrderId(Integer orderId) {
        return orderItemRepository.findByOrder_OrderId(orderId)
                .stream()
                .map(OrderItemMapper::toDTO)
                .collect(Collectors.toList());
    }
}