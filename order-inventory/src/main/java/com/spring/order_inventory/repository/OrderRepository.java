package com.spring.order_inventory.repository;

import com.spring.order_inventory.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface OrderRepository extends JpaRepository<Order, Integer> {
    List<Order> findByCustomerCustomerId(Integer id);
    List<Order> findByStoreStoreId(Integer id);
}
