package com.persistance;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.model.Propietario;




@Repository
public interface PropietarioRepository extends MongoRepository<Propietario, String> {

}
