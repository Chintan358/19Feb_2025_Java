package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.exception.ResourceNotFound;
import com.example.demo.model.Role;
import com.example.demo.repo.RoleRepo;
import com.example.demo.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	RoleRepo repo;
	
	@Override
	public List<Role> allRoles() {
		
		return repo.findAll();
	}

	@Override
	public Role addRole(Role role) {
	
		return repo.save(role);
	}

	@Override
	public Role roleById(int id) {
		
		return repo.findById(id).orElseThrow(()->new ResourceNotFound("Role", "ID", id));
	}

	@Override
	public void deleteRole(int id) {
		 
		Role role =  repo.findById(id).orElseThrow();
		repo.delete(role);
	}

	@Override
	public Role updateRole(Role role, int id) {
		
		Role existed =  repo.findById(id).orElseThrow();
		existed.setRole(role.getRole());
		return  repo.save(existed);
	}

}
