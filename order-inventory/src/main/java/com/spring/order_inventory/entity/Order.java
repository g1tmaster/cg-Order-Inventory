package com.spring.order_inventory.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.hibernate.annotations.ManyToAny;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "orders")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Order {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "order_id")
	private long orderId;
	
	@Column(name = "order_tms")
	private LocalDateTime orderTms;
	
	@ManyToOne
	@JoinColumn(name = "customer_id", nullable = false)
	private Customers customer;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "order_status", nullable = false)
	private String orderStatus;
	
	@ManyToOne
	@JoinColumn(name = "store_id", nullable = false)
	private Stores store;
	
	
}
