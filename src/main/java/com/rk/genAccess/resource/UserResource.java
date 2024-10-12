package com.rk.genAccess.resource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rk.genAccess.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		User maria = new User("1", "Maria Gomes", "mariagomes@gmail.com", "senhafoda123");
		User jorge = new User("2", "Jorge Gomes", "jorgegomes@gmail.com", "senhafoda1233");
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(maria,jorge));
		return ResponseEntity.ok().body(list);
	}
}	
