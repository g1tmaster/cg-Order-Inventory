package com.spring.order_inventory.repository;

import com.spring.order_inventory.entity.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory, Long> {
    List<Inventory> findByStoreStoreId(Long id);
    List<Inventory> findByProductProductId(Long id);
}