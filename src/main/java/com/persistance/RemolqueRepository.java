package com.persistance;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.model.Remolque;




@Repository
public interface RemolqueRepository extends MongoRepository<Remolque, String> {

}
