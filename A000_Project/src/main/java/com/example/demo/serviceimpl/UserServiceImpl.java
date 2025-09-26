package com.example.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repo.UserRepo;
import com.example.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepo repo;
	
	@Override
	public void addorUpdateUser(User user) {
		// TODO Auto-generated method stub
		repo.save(user);
	}

	@Override
	public List<User> allUsers() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public User userById(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElseThrow();
	}

	@Override
	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

	@Override
	public User loginUser(User u) {
		
		return repo.loginuser(u.getEmail(), u.getPassword(), u.getRole());
	}

}
