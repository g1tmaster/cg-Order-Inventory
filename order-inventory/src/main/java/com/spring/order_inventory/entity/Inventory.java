package com.spring.order_inventory.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "inventory")
public class Inventory {


        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "inventory_id")
        private Long inventoryId;

        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "store_id", nullable = false)
        private Store storeId;


        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "product_id", nullable = false)
        private Product product;

        @Column(name = "product_inventory", nullable = false)
        private Long quantity;


        public Inventory() {}

        public Inventory(Store storeId, Product product, Long quantity) {
            this.storeId = storeId;
            this.product = product;
            this.quantity = quantity;
        }

    public Long getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(Long inventoryId) {
        this.inventoryId = inventoryId;
    }

    public Store getStoreId() {
        return storeId;
    }

    public void setStoreId(Store storeId) {
        this.storeId = storeId;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }
}


