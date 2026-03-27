package com.spring.order_inventory.repository;

import com.spring.order_inventory.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersRepository extends JpaRepository<Order,Long> {
}
