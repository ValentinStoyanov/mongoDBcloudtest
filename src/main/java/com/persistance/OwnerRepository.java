package com.persistance;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.model.Owner;




@Repository
public interface OwnerRepository extends MongoRepository<Owner, String> {

}
