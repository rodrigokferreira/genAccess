package com.rk.genAccess.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.rk.genAccess.entities.Permission;

@Repository
public interface PermissionRepository extends MongoRepository<Permission, String>{

}
