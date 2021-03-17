package com.persistance;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.model.Camion;

@Repository
public interface CamionRepository extends MongoRepository<Camion, String> {
	
	Optional<Camion> findByMatricula (String matricula);

}
