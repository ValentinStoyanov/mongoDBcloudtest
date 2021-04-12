package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Truck;
import com.persistance.TruckRepository;


@RestController
@RequestMapping("truck")
public class TruckController {
	
	@Autowired
	private TruckRepository truckRepository;
	
	
	@GetMapping(value="getAll")
    public List<Truck> getAll(){
        
        return this.truckRepository.findAll();
    }
	
	@PostMapping("create")
	public List<Truck> create(@RequestBody List<Truck> truck) {
		
		return this.truckRepository.insert(truck);
		
	}
	
	@PostMapping("deleteAll")
	public void delete_all() {
		this.truckRepository.deleteAll();
		
	}
}
