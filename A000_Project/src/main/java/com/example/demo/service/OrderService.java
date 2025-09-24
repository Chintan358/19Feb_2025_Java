package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Order;
import com.example.demo.model.User;

public interface OrderService {

	public Order addorUpdateOrder(Order o);
	public List<Order> allOrders();
	public List<Order> orderByUser(User user);
}
