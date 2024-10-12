package com.rk.genAccess.config;

import java.util.Arrays;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.rk.genAccess.dto.UserDTO;
import com.rk.genAccess.entities.ODS;
import com.rk.genAccess.entities.Permission;
import com.rk.genAccess.entities.User;
import com.rk.genAccess.repository.ODSRepository;
import com.rk.genAccess.repository.PermissionRepository;
import com.rk.genAccess.repository.UserRepository;

@Configuration
public class instantiation implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository;
	
	@Autowired 
	private ODSRepository odsRepository;
	
	@Autowired
	private PermissionRepository permissionRepository;

	@Override
	public void run(String... args) throws Exception {
		
		userRepository.deleteAll();
		odsRepository.deleteAll();
		permissionRepository.deleteAll();
		
		User rodolfo = new User(null, "Rodoldo Cristo", "rodo@gmail.com", "senharodo123");
		User brucetoso = new User(null, "Bru lerto", "bro@gmail.com", "senhabru123");
		
		userRepository.saveAll(Arrays.asList(rodolfo, brucetoso));
		
		Permission p1 = new Permission(null, "Manutenção Divino", null, new UserDTO(rodolfo));
		Permission p2 = new Permission(null, "Acesso ao Sistema", null, new UserDTO(brucetoso));
		
        permissionRepository.saveAll(Arrays.asList(p1, p2));
		
		ODS ods = new ODS(null, "Praimar", "Manutenção", new Date(), p1, new UserDTO(rodolfo));
		odsRepository.saveAll(Arrays.asList(ods));
		
	}
	
	
}
