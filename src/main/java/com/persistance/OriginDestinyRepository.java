package com.persistance;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.model.OriginDestiny;



@Repository
public interface OriginDestinyRepository extends MongoRepository<OriginDestiny, String> {

	OriginDestiny findByAddress(String address);
}
