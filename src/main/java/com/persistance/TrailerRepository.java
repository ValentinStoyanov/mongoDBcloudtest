package com.persistance;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.model.Load;
import com.model.Trailer;




@Repository
public interface TrailerRepository extends MongoRepository<Trailer, String> {
	
	Trailer findByRegistrationtag (String registrationtag );
	
	Trailer findByIdload (int idload );
	
	List<Trailer> findByBrand(String brand);
	
	List<Trailer> findByIdloadGreaterThanOrderByIdload(int idload);

}
