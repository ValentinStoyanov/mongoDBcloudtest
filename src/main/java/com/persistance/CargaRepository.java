package com.persistance;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.model.Carga;


@Repository
public interface CargaRepository extends MongoRepository<Carga, String>{

	Carga findByCodigo(int codigo);

}
