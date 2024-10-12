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
		
		ODS ods1 = new ODS(null, "Praimar", "Manutenção Divino", new Date(), new UserDTO(rodolfo));
		ODS ods2 = new ODS(null, "Miramar", "Vistoria", new Date(), new UserDTO(brucetoso));
		odsRepository.saveAll(Arrays.asList(ods1, ods2));
		
		Permission p1 = new Permission(null, "Manutenção Divino", ods1);
		Permission p2 = new Permission(null, "Acesso ao Sistema", ods2);
		
		permissionRepository.saveAll(Arrays.asList(p1, p2));
		
	}
	
	
}
