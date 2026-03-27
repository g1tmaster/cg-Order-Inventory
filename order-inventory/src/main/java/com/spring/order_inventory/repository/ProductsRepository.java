package com.spring.order_inventory.repository;

import com.spring.order_inventory.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<Product,Long> {
}
