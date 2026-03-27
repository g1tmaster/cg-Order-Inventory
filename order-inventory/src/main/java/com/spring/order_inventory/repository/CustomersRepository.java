package com.spring.order_inventory.repository;

import com.spring.order_inventory.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomersRepository extends JpaRepository<Customer,Long> {
}
