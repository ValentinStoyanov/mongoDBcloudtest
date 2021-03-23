package com.persistance;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.model.CargaRemolque;


public interface CargaRemolqueRepository extends MongoRepository<CargaRemolque, String > {

}
