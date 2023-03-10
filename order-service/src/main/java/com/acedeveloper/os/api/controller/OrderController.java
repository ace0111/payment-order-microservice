package com.acedeveloper.os.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.acedeveloper.os.api.common.TransactionRequest;
import com.acedeveloper.os.api.common.TransactionResponse;
import com.acedeveloper.os.api.service.OrderService;
import com.fasterxml.jackson.core.JsonProcessingException;

@RestController
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	private OrderService service;
	
	@PostMapping("/bookOrder")
	public TransactionResponse bookOrder(@RequestBody TransactionRequest request) throws JsonProcessingException {
		
		return service.saveOrder(request);
//		return service.saveOrder(order);
	}
}
