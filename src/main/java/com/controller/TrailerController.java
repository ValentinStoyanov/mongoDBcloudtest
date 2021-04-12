package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Trailer;
import com.persistance.TrailerRepository;

@RestController
@RequestMapping("trailer")
public class TrailerController {
	
	@Autowired
	private TrailerRepository trailerRepository;
	
	
	@GetMapping(value="getAll")
    public List<Trailer> getAll(){
        
        return this.trailerRepository.findAll();
    }
	
	@PostMapping("create")
	public List<Trailer> create(@RequestBody List<Trailer> trailer) {
		
		return this.trailerRepository.insert(trailer);
		
	}
	@PostMapping("deleteAll")
	public void delete_all() {
		this.trailerRepository.deleteAll();
		
	}
}