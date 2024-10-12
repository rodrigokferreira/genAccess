package com.rk.genAccess.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rk.genAccess.entities.Permission;
import com.rk.genAccess.services.PermissionService;

@RestController
@RequestMapping(value = "/permission")
public class PermissionResource {
	
	@Autowired
	private PermissionService service;
	
	@GetMapping
	public ResponseEntity<List<Permission>> findAll() {
		List<Permission> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
}	
	