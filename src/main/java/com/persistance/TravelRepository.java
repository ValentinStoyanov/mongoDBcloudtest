package com.persistance;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.model.Travel;




@Repository
public interface TravelRepository extends MongoRepository<Travel, String> {

	Travel findByIddriver (String iddriver);
	List<Travel> findByIdtrailer (String idtrailer);
	
}
