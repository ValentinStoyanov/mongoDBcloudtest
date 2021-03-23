package com.persistance;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.model.Carga;


@Repository
public interface CargaRepository extends MongoRepository<Carga, String>{

	Carga findByCodigo(int codigo);
	
	List<Carga> findByPesoGreaterThan(int peso);
	
	List<Carga> findByCodigoGreaterThanOrderByCodigo(int codigo);

}
