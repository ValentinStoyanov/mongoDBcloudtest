package com.persistance;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.model.Coordinate;



@Repository
public interface CoordinateRepository extends MongoRepository<Coordinate, String> {

}
