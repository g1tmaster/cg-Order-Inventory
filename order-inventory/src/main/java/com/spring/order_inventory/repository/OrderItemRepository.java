package com.spring.order_inventory.repository;

import com.spring.order_inventory.entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface OrderItemRepository extends JpaRepository<OrderItem, Integer> {

    List<OrderItem> findByOrderOrderId(Integer id);

    @Query("SELECT oi FROM OrderItem oi " +
            "JOIN FETCH oi.product " +
            "WHERE oi.shipment.shipmentId = :shipmentId")
    List<OrderItem> findByShipmentShipmentId(@Param("shipmentId") Integer shipmentId);

    List<OrderItem> findByShipment_ShipmentId(Integer shipmentId);

    List<OrderItem> findByOrder_OrderId(Integer orderId);
}