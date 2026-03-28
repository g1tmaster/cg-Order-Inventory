package com.spring.order_inventory.repository;

import com.spring.order_inventory.entity.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface InventoryRepository extends JpaRepository<Inventory, Long> {
    List<Inventory> findByStoreStoreId(Long id);
    List<Inventory> findByProductProductId(Long id);
}