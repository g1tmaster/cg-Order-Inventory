package com.spring.order_inventory.repository;

import com.spring.order_inventory.entity.Shipment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ShipmentRepository extends JpaRepository<Shipment, Long> {
    List<Shipment> findByCustomerCustomerId(Long id);
}