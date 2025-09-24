package com.example.demo.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.OrderDetails;
import com.example.demo.repo.OrderDetailsRepo;
import com.example.demo.service.OrderDetailsService;

@Service
public class OrderDetailsServiceImpl implements OrderDetailsService {

	@Autowired
	OrderDetailsRepo detailsRepo;
	
	@Override
	public void addOrUpdate(OrderDetails details) {
		// TODO Auto-generated method stub
		detailsRepo.save(details);
		
	}

}
