package com.spring.order_inventory.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "order_items")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "line_item_id", nullable = false)
    private Integer lineItemId;

    @ManyToOne(fetch = FetchType.LAZY)   // ← LAZY
    @JoinColumn(name = "order_id", nullable = false)
    @ToString.Exclude
    private Order order;

    @ManyToOne(fetch = FetchType.LAZY)   // ← LAZY
    @JoinColumn(name = "product_id", nullable = false)
    @ToString.Exclude
    private Product product;

    @ManyToOne(fetch = FetchType.LAZY)   // ← LAZY
    @JoinColumn(name = "shipment_id")
    @ToString.Exclude
    private Shipment shipment;

    @Column(name = "unit_price", nullable = false)
    private Double unitPrice;

    @Column(name = "quantity", nullable = false)
    private Integer quantity;
}