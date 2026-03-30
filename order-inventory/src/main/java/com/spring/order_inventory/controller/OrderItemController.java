package com.spring.order_inventory.controller;

import com.spring.order_inventory.dto.OrderItemResponseDto;
import com.spring.order_inventory.service.IOrderItemsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/order-items")
public class OrderItemController {

    @Autowired
    private IOrderItemsService orderItemsService;

    // ✅ 1. GET ALL DETAILS
    @GetMapping("/details")
    public List<OrderItemResponseDto> getAllOrderItemDetails() {
        return orderItemsService.getAllOrderItemDetails();
    }

    // ✅ 2. GET BY SHIPMENT ID
    @GetMapping("/shipment/{shipmentId}")
    public List<OrderItemResponseDto> getByShipmentId(@PathVariable Integer shipmentId) {
        return orderItemsService.getByShipmentId(shipmentId);
    }

    // ✅ 3. GET BY ORDER ID
    @GetMapping("/order/{orderId}")
    public List<OrderItemResponseDto> getByOrderId(@PathVariable Integer orderId) {
        return orderItemsService.getByOrderId(orderId);
    }
}