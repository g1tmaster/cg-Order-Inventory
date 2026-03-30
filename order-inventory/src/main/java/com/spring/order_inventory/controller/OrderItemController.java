package com.spring.order_inventory.controller;

import com.spring.order_inventory.dto.OrderItemResponseDto;
import com.spring.order_inventory.service.IOrderItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/order-items")
@RequiredArgsConstructor
public class OrderItemController {
    private final IOrderItemService orderItemService;

    @GetMapping("/shipment/{shipmentId}")
    public ResponseEntity<List<OrderItemResponseDto>> getOrderItemsByShipmentId(@PathVariable Integer shipmentId) {
        return ResponseEntity.ok(orderItemService.getOrderByShipmentId(shipmentId));
    }
}
