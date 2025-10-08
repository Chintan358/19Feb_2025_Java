package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Role;

public interface RoleService {

	public List<Role> allRoles();
	public Role addRole(Role role);
	public Role roleById(int id);
	public void deleteRole(int id);
	public Role updateRole(Role role, int id);
}
