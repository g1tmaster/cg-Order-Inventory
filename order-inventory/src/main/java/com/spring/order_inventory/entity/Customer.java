package com.spring.order_inventory.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private Long customerId;

    @Column(name = "email_address")
    private String emailAddress;

    @Column(name = "full_name")
    private String fullName;
}
