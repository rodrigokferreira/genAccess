package com.rk.genAccess.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.rk.genAccess.entities.ODS;

@Repository
public interface ODSRepository extends MongoRepository<ODS, String>{

}
