package com.spring.order_inventory.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.order_inventory.dto.OrderResponseDto;
import com.spring.order_inventory.dto.StoreResponseDto;
import com.spring.order_inventory.service.IOrderService;


@RestController
@RequestMapping("/api/orders")
public class OrderController {
	private final IOrderService orderService;

    // Constructor Injection
    public OrderController(IOrderService orderService) {
        this.orderService = orderService;
    }

    
    @GetMapping("/{id}")
    public ResponseEntity<OrderResponseDto> getOrderById(@PathVariable Integer id) {
        return ResponseEntity.ok(orderService.getOrderById(id));
    }

    
    @GetMapping("/{orderId}/store")
    public ResponseEntity<StoreResponseDto> getStoreByOrderId(@PathVariable Integer orderId) {
        return ResponseEntity.ok(orderService.getStoreByOrderId(orderId));
    }

    
    @GetMapping("/customer/{customerId}")
    public ResponseEntity<List<OrderResponseDto>> getOrdersByCustomerId(@PathVariable Integer customerId) {
        return ResponseEntity.ok(orderService.getOrdersByCustomerId(customerId));
    }

    
    @GetMapping("/store/{storeId}")
    public ResponseEntity<List<OrderResponseDto>> getOrdersByStoreId(@PathVariable Integer storeId) {
        return ResponseEntity.ok(orderService.getOrdersByStoreId(storeId));
    }
}
