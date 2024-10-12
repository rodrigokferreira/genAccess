package com.rk.genAccess.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.rk.genAccess.entities.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
