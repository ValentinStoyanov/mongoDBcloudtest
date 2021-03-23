package com.persistance;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.model.Carga;
import com.model.Remolque;




@Repository
public interface RemolqueRepository extends MongoRepository<Remolque, String> {
	
	Remolque findByMatricula (String matricula);
	
	Remolque findByIdcarga (int idcarga );
	
	List<Remolque> findByMarca(String marca);
	
	List<Remolque> findByIdcargaGreaterThanOrderByIdcarga(int idcarga);

}
