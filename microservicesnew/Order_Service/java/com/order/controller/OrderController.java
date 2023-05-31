package com.order.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.order.dto.OrderRequest;
import com.order.services.IOrderMgmtService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/order")
@RequiredArgsConstructor
public class OrderController 
{
	private final IOrderMgmtService service;
	@PostMapping("/")
	@ResponseStatus(HttpStatus.CREATED)
	public String placeOrder( @RequestBody OrderRequest orderRequest)
	{
		service.placeOrder(orderRequest);
		return "Order Place Successfully";
		
	}

}
