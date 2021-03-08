package com.persistance;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.model.Viaje;




@Repository
public interface ViajeRepository extends MongoRepository<Viaje, String> {

	Viaje findByIdconductor (String idconductor);
	
}
