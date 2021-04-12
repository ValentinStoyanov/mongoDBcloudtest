package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Travel;
import com.persistance.TravelRepository;

@RestController
@RequestMapping("travel")
public class TravelController {
	
	@Autowired
	private TravelRepository travelRepository;
	
	
	@GetMapping(value="getAll")
    public List<Travel> getAll(){
        
        return this.travelRepository.findAll();
    }
	
	@PostMapping("create")
	public List<Travel> create(@RequestBody List<Travel> travel) {
		
		return this.travelRepository.insert(travel);
		
	}
	
	
	@PostMapping("createone")
	public Travel createone(@RequestBody Travel travel) {
		
		return this.travelRepository.insert(travel);
		
	}
	
	@PostMapping("deleteAll")
	public void delete_all() {
		this.travelRepository.deleteAll();
		
	}
}