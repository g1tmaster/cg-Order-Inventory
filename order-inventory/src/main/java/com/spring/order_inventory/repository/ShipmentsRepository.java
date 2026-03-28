package com.spring.order_inventory.repository;

import com.spring.order_inventory.entity.Shipment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShipmentsRepository extends JpaRepository<Shipment,Integer> {
}
