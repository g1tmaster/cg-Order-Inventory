package com.spring.order_inventory.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "shipments")
public class Shipment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "shipment_id")
    private Long shipmentId;

    @ManyToOne
    @JoinColumn(name = "store_id",nullable = false)
    private Store store;

    @ManyToOne
    @JoinColumn(name = "customer_id",nullable = false)
    private Customer customer;

    @Column(name = "delivery_address")
    private String deliveryAddress;

    @Column(name = "shipment_status")
    private String shipmentStatus;
}