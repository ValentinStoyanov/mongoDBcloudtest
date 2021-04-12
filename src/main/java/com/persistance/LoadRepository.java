package com.persistance;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.model.Load;


@Repository
public interface LoadRepository extends MongoRepository<Load, String>{

	Load findByCode(int code);
	
	List<Load> findByLoadGreaterThan(int load);
	
	List<Load> findByCodeGreaterThanOrderByCode(int code);

}
