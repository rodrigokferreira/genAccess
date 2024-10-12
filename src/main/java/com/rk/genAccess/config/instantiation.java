package com.rk.genAccess.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.rk.genAccess.entities.User;
import com.rk.genAccess.repository.UserRepository;

@Configuration
public class instantiation implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		userRepository.deleteAll();
		
		User rodolfo = new User(null, "Rodoldo Cristo", "rodo@gmail.com", "senharodo123");
		User brucetoso = new User(null, "Bru lerto", "bro@gmail.com", "senhabru123");
		
		userRepository.saveAll(Arrays.asList(rodolfo, brucetoso));
		
	}
	
	
}
