package com.rk.genAccess.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rk.genAccess.entities.ODS;
import com.rk.genAccess.services.ODSService;

@RestController
@RequestMapping(value = "/orders")
public class ODSResource {
	
	@Autowired
	private ODSService service;
	
	@GetMapping
	public ResponseEntity<List<ODS>> findAll() {
		List<ODS> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
}	
