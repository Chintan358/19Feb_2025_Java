package com.example.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Cart;
import com.example.demo.model.Product;
import com.example.demo.model.User;
import com.example.demo.repo.CartRepo;
import com.example.demo.service.CartService;

@Service
public class CartServiceImpl implements CartService {

	@Autowired
	CartRepo cartRepo;
	
	@Override
	public void addorUpdateCart(Cart c) {
		// TODO Auto-generated method stub
		cartRepo.save(c);
	}

	@Override
	public List<Cart> cartByUser(User user) {
		// TODO Auto-generated method stub
		return cartRepo.findByUser(user);
	}

	@Override
	public Cart cartById(int id) {
		// TODO Auto-generated method stub
		return cartRepo.findById(id).orElseThrow();
	}

	@Override
	public void delteCart(int id) {
		// TODO Auto-generated method stub
		cartRepo.deleteById(id);
	}

	@Override
	public Cart existByUserAndProduct(User user, Product product) {
		// TODO Auto-generated method stub
		return cartRepo.existByUserAndProduct(user, product);
	}

}
