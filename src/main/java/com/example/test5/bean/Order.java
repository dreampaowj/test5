package com.example.test5.bean;

import java.util.UUID;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;

import lombok.RequiredArgsConstructor;

public class Order {
	@Embedded
	private final OrderId id = Order.OrderId.create();
	
	@Embeddable
	@RequiredArgsConstructor(staticName = "create")
	private static final class OrderId {
		UUID id;
	}
}
