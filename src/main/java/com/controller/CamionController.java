package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Camion;
import com.persistance.CamionRepository;


@RestController
@RequestMapping("camion")
public class CamionController {
	
	@Autowired
	private CamionRepository camionRepository;
	
	
	@GetMapping(value="getAll")
    public List<Camion> getAll(){
        
        return this.camionRepository.findAll();
    }
	
	@PostMapping("create")
	public List<Camion> create(@RequestBody List<Camion> camion) {
		
		return this.camionRepository.insert(camion);
		
	}
}
