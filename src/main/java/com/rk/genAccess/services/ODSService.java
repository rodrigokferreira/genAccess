package com.rk.genAccess.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rk.genAccess.entities.ODS;
import com.rk.genAccess.repository.ODSRepository;

@Service
public class ODSService {
	
	@Autowired
	private ODSRepository repo;
	
	public List<ODS> findAll() {
		return repo.findAll();
	}
}
