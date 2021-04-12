package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Load;
import com.persistance.LoadRepository;



@RestController
@RequestMapping("load")
public class LoadController {
	
	@Autowired
	private LoadRepository loadRepository;
	
	
	@GetMapping(value="getAll")
    public List<Load> getAll(){
        
        return this.loadRepository.findAll();
    }
	
	@PostMapping("create")
	public List<Load> create(@RequestBody List<Load> load) {
		
		return this.loadRepository.insert(load);
		
	}
	
	@PostMapping("deleteAll")
	public void delete_all() {
		this.loadRepository.deleteAll();
		
	}
}