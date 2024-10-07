package com.cnkart.order.service;

import java.util.UUID;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cnkart.order.dto.OrderRequest;
import com.cnkart.order.model.Order;
import com.cnkart.order.repository.OrderRepository;

import java.util.*;
import org.springframework.http.*;

@Service
public class OrderService {

	private final OrderRepository orderRepository;
	private final RestTemplate restTemplate;

	public OrderService(OrderRepository orderRepository, RestTemplateBuilder builder) {
		this.orderRepository = orderRepository;
		this.restTemplate = builder.build();
	}

	public String placeOrder(OrderRequest orderRequest) {
		Order order = new Order();
		order.setOrderNumber(UUID.randomUUID().toString());
		order.setPrice(orderRequest.getPrice());
		order.setQuantity(orderRequest.getQuantity());
		order.setSkuCode(orderRequest.getSkuCode());

		// Define the URL with placeholders for skuCode and qty
		String resourceUrl = "http://localhost:8083/api/inventory?skuCode={skuCode}&qty={qty}";

		// Create the URI variables to replace the placeholders
		Map<String, Object> uriVariables = new HashMap<>();
		uriVariables.put("skuCode", orderRequest.getSkuCode());
		uriVariables.put("qty", orderRequest.getQuantity());

		// Perform the exchange
		ResponseEntity<Boolean> responseEntity = restTemplate.exchange(resourceUrl, // URL with placeholders
				HttpMethod.GET, // HTTP method (GET in this case)
				null, // No request body or headers, so we pass 'null'
				Boolean.class, // Expected response type
				uriVariables // Variables to replace the placeholders in the URL
		);

		// Extract the body (Boolean value)
		boolean isInStock = Boolean.TRUE.equals(responseEntity.getBody());

		if (isInStock) {
			orderRepository.save(order);
			return "Order Placed";
		} else {
			return "Item is not in stock, please try again later";
		}

	}
}
