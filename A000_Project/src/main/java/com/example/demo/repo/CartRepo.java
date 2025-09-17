package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.Cart;
import com.example.demo.model.Product;
import com.example.demo.model.User;

public interface CartRepo extends JpaRepository<Cart, Integer> {

	
	public List<Cart> findByUser(User user);
	
	@Query("select c from Cart c where c.user=:user and c.product=:product")
	Cart existByUserAndProduct(@Param("user")User user,@Param("product") Product product);
}
