package com.persistance;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.model.Coordenada;



@Repository
public interface CoordenadaRepository extends MongoRepository<Coordenada, String> {

}
