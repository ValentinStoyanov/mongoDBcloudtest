package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.model.Camion;
import com.model.Carga;
import com.model.Conductor;
import com.model.OrigenDestino;
import com.model.Remolque;
import com.model.Viaje;
import com.persistance.CamionRepository;
import com.persistance.CargaRepository;
import com.persistance.ConductorRepository;
import com.persistance.OrigenDestinoRepository;
import com.persistance.RemolqueRepository;
import com.persistance.ViajeRepository;

@RestController
@RequestMapping("consulta")
public class ConsultaController {

	
	@Autowired
	private ViajeRepository viajeRepository;
	
	@Autowired
	private ConductorRepository conductorRepository; 
	
	@Autowired
	private CamionRepository camionRepository;
	
	@Autowired
	private RemolqueRepository remolqueRepository;
	
	@Autowired
	private CargaRepository cargaRepository;
	
	@Autowired
	private OrigenDestinoRepository orepository;
	
	
	@GetMapping(value="getViaje")
    public String getConductor(@RequestParam String dni){
		
		Viaje viaje = this.viajeRepository.findByIdconductor(dni);
		
		Conductor conductor = this.conductorRepository.findByDni(dni);
		
		Camion camion = this.camionRepository.findByMatricula(viaje.getIdcamion());
		
		Remolque remolque = this.remolqueRepository.findByMatricula(viaje.getIdremolque());
		
		Carga carga = this.cargaRepository.findByCodigo(remolque.getIdcarga());
		
		OrigenDestino origen = this.orepository.findByDireccion(carga.getIdorigen());
		
		OrigenDestino destino = this.orepository.findByDireccion(carga.getIddestino());
		
		
		String resultado = "En este viaje el conductor tiene dni: "+ conductor.getDni() +" con nombre: "+ conductor.getNombre() +", el camion matricula : "+ camion.getMatricula()
		+ "y con el remolque: "+ remolque.getMatricula() + "\n"
		+ "en el que se carga:" + carga.getTipo() + "Con origen: "+ origen.getDireccion()+", y destino: "+destino.getDireccion();
        
		
        return resultado;
    }
	
	
}