package com.spring.order_inventory.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.order_inventory.dto.OrderResponseDto;
import com.spring.order_inventory.dto.StoreResponseDto;
import com.spring.order_inventory.entity.Order;
import com.spring.order_inventory.entity.Store;
import com.spring.order_inventory.exception.IdNotFoundException;
import com.spring.order_inventory.mapper.OrderMapper;
import com.spring.order_inventory.repository.OrderRepository;
import com.spring.order_inventory.service.IOrderService;

@Service
public class OrderServiceImpl implements IOrderService {
	private final OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public OrderResponseDto getOrderById(Integer id) {

        Order order = orderRepository.findById(id)
                .orElseThrow(() -> new IdNotFoundException("Order not found with id: " + id));

        return OrderMapper.toDto(order);
    }

    
    public StoreResponseDto getStoreByOrderId(Integer orderId) {

        Order order = orderRepository.findById(orderId)
                .orElseThrow(() -> new IdNotFoundException("Order not found with id: " + orderId));

        Store store = order.getStore();

        return StoreResponseDto.builder()
                .storeId(store.getStoreId())
                .storeName(store.getStoreName())
                .build();
    }

    public List<OrderResponseDto> getOrdersByCustomerId(Integer customerId) {

        List<Order> orders = orderRepository.findByCustomerCustomerId(customerId);

        return OrderMapper.toDtoList(orders);
    }
    
    public List<OrderResponseDto> getOrdersByStoreId(Integer storeId) {

        List<Order> orders = orderRepository.findByStoreStoreId(storeId);

        return OrderMapper.toDtoList(orders);
    }
	
}
