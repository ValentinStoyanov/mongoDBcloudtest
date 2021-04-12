package com.persistance;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.model.Truck;

@Repository
public interface TruckRepository extends MongoRepository<Truck, String> {
	
	Optional<Truck> findByRegistrationtag (String registrationtag );

}
