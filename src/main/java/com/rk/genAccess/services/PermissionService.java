package com.rk.genAccess.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rk.genAccess.entities.Permission;
import com.rk.genAccess.repository.PermissionRepository;

@Service
public class PermissionService {
	
	@Autowired
	private PermissionRepository repo;
	
	public List<Permission> findAll() {
		return repo.findAll();
	}
}
