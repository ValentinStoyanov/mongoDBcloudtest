package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Coordinate;
import com.persistance.CoordinateRepository;



@RestController
@RequestMapping("coordenate")
public class CoordinateController {
	
	@Autowired
	private CoordinateRepository coordinateRepository;
	
	
	@GetMapping(value="getAll")
    public List<Coordinate> getAll(){
        
        return this.coordinateRepository.findAll();
    }
	
	@PostMapping("create")
	public List<Coordinate> create(@RequestBody List<Coordinate> coordinate) {
		
		return this.coordinateRepository.insert(coordinate);
		
	}
	@PostMapping("deleteAll")
	public void delete_all() {
		this.coordinateRepository.deleteAll();
		
	}
}
