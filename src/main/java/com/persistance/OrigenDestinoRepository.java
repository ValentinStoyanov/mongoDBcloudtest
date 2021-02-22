package com.persistance;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.model.OrigenDestino;



@Repository
public interface OrigenDestinoRepository extends MongoRepository<OrigenDestino, String> {

}
