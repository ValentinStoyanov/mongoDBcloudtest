package com.persistance;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.model.Conductor;



@Repository
public interface ConductorRepository extends MongoRepository<Conductor, String> {

}
