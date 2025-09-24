package com.example.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Order;
import com.example.demo.model.User;
import com.example.demo.repo.OrderRepo;
import com.example.demo.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	OrderRepo orderRepo;
	
	@Override
	public Order addorUpdateOrder(Order o) {
		// TODO Auto-generated method stub
		return orderRepo.save(o);
	}

	@Override
	public List<Order> allOrders() {
		// TODO Auto-generated method stub
		return orderRepo.findAll();
	}

	@Override
	public List<Order> orderByUser(User user) {
		// TODO Auto-generated method stub
		return orderRepo.findByUser(user);
	}

}
