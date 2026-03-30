package com.spring.order_inventory.repository;

import com.spring.order_inventory.entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderItemRepository extends JpaRepository<OrderItem, Integer> {

    List<OrderItem> findByShipment_ShipmentId(Integer shipmentId);

    List<OrderItem> findByOrder_OrderId(Integer orderId);
}