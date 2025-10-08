package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.RoleDto;
import com.example.demo.model.Role;
import com.example.demo.service.RoleService;

@RestController
@RequestMapping("/roles")
public class RoleController {

	@Autowired
	RoleService roleService;	
	
	@GetMapping("/")
	public ResponseEntity<List<RoleDto>> allRoles()
	{
		List<Role> allRoles = roleService.allRoles();
		List<RoleDto> dtos = new ArrayList<>();
		for(Role r : allRoles)
		{
			RoleDto rd = new RoleDto();
			rd.setId(r.getId());
			rd.setRole(r.getRole());
			
			dtos.add(rd);
		}
		
		return new ResponseEntity<>(dtos,HttpStatus.OK);
		
	}
	
	@PostMapping("/")
	public ResponseEntity<RoleDto> addRole(@RequestBody Role role)
	{
		Role createdRole = roleService.addRole(role);
		
		RoleDto dto = new RoleDto();
		dto.setId(createdRole.getId());
		dto.setRole(createdRole.getRole());
		
		return new ResponseEntity<>(dto,HttpStatus.CREATED);
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<RoleDto> Rolebyid(@PathVariable("id") int id)
	{
		Role role = roleService.roleById(id);
		
		RoleDto dto = new RoleDto();
		dto.setId(role.getId());
		dto.setRole(role.getRole());
		
		return new ResponseEntity<>(dto,HttpStatus.CREATED);
	}
}
