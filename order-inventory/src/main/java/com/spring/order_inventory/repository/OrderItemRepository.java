package com.spring.order_inventory.repository;

import com.spring.order_inventory.entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
    List<OrderItem> findByOrderOrderId(Long id);
    List<OrderItem> findByShipmentShipmentId(Long id);
}