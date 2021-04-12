package com.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.model.Truck;
import com.model.Load;
import com.model.CargaRemolque;
import com.model.Driver;
import com.model.OriginDestiny;
import com.model.Trailer;
import com.model.Travel;
import com.persistance.TruckRepository;
import com.persistance.CargaRemolqueRepository;
import com.persistance.LoadRepository;
import com.persistance.DriverRepository;
import com.persistance.OriginDestinyRepository;
import com.persistance.TrailerRepository;
import com.persistance.TravelRepository;

@RestController
@RequestMapping("consulta")
public class QueryController {

	
	@Autowired
	private TravelRepository viajeRepository;
	
	@Autowired
	private DriverRepository conductorRepository; 
	
	@Autowired
	private TruckRepository camionRepository;
	
	@Autowired
	private TrailerRepository remolqueRepository;
	
	@Autowired
	private LoadRepository cargaRepository;
	
	@Autowired
	private OriginDestinyRepository orepository;
	
	@Autowired
	private CargaRemolqueRepository crrepository;
	
		
	
	@PostMapping(value="cargascomplejo")
	public List<Query2Class> consulta_grande_compleja(@RequestParam int max, @RequestParam String brand) {
		
		List<Load> listacargas = this.cargaRepository.findByLoadGreaterThan(max);
		
		List<Trailer> listaremolque= this.remolqueRepository.findByBrand(brand);
		
		Load carga_aux;
		
		Trailer r_aux;
		
		List<Query2Class> cs = new ArrayList();
		
		Query2Class cons ;
		
		OriginDestiny origen ;
		OriginDestiny destino ;
		List<Travel> viaje ;
		Optional<Truck> camion ;
		Driver conductor;
		
		
		for(int i = 0; i <listacargas.size(); i++) {
			
			carga_aux =listacargas.remove(i);
			
			for(int j = 0; j< listaremolque.size();j++) {
				if(listaremolque.get(j).getIdload()==carga_aux.getCode()) {
					r_aux = listaremolque.remove(j);
					
					
					origen = this.orepository.findByAddress(carga_aux.getIdorigin());
					destino = this.orepository.findByAddress(carga_aux.getIddestiny());
					viaje = this.viajeRepository.findByIdtrailer(r_aux.getRegistrationtag());
					
					cons = new Query2Class();
					
					cons.setLoad_code(carga_aux.getCode());
					cons.setLoad(carga_aux.getLoad());
					cons.setLoad_type(carga_aux.getType());
					cons.setDestiny(destino.getAddress());
					cons.setOrigin(origen.getAddress());
					cons.setTrailer_brand(r_aux.getBrand());
					cons.setTruck_registration(viaje.get(0).getIdtruck());
					cons.setTrailer_registration(viaje.get(0).getIdtrailer());
					
					
					
					cs.add(cons);
					
					
					
				}	
			}
		}		
		
		
		return cs;
	}
	
	
	
	@PostMapping(value="cargas")
	public List<Query1Class> consulta_grande(@RequestParam int max, @RequestParam String brand) {
		
		List<Load> loads_list = this.cargaRepository.findByLoadGreaterThan(max);
		
		List<Trailer> trailer_list= this.remolqueRepository.findByBrand(brand);
		
		Load load_aux;
		
		Trailer r_aux;
		
		List<Query1Class> cs = new ArrayList();
		
		Query1Class cons ;
		OriginDestiny origin ;
		OriginDestiny destiny ;
		
		
		for(int i = 0; i <loads_list.size(); i++) {
			
			load_aux =loads_list.remove(i);
			
			for(int j = 0; j< trailer_list.size();j++) {
				if(trailer_list.get(j).getIdload()==load_aux.getCode()) {
					r_aux = trailer_list.remove(j);
					
					
					origin = this.orepository.findByAddress(load_aux.getIdorigin());
					destiny = this.orepository.findByAddress(load_aux.getIddestiny());
					
					
					cons = new Query1Class();
					
					cons.setLoadcode(load_aux.getCode());
					cons.setLoad(load_aux.getLoad());
					cons.setLoadtype(load_aux.getType());
					cons.setDestiny(destiny.getAddress());
					cons.setOrigin(origin.getAddress());
					cons.setTrailerbrand(r_aux.getBrand());
					
					
					
					cs.add(cons);
					
					
					
				}	
			}
		}		
		
		
		return cs;
	}
	
	
	/*
	
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
	
	@GetMapping(value="getRutas")
	public String getViajes(@RequestParam int min, @RequestParam int max ) {
		

		String resultado = "";
		
		Carga carga;
		OrigenDestino origen;
		OrigenDestino destino;
		Remolque remolque;
		Viaje viaje;
		Conductor conductor;
		Camion camion;
		
		
		for (int i = min ; i < max; i++) {
			
			carga = this.cargaRepository.findByCodigo(i);
			
			origen = this.orepository.findByDireccion(carga.getIdorigen());
			
			destino = this.orepository.findByDireccion(carga.getIddestino());
			
			remolque = this.remolqueRepository.findByIdcarga(carga.getCodigo());
			
			viaje = this.viajeRepository.findByIdremolque(remolque.getMatricula());
			
			conductor = this.conductorRepository.findByDni(viaje.getIdconductor());
			
			camion = this.camionRepository.findByMatricula(viaje.getIdcamion());
			
			resultado = resultado + "Conductor dni: "+ conductor.getDni() +" Nombre: "+ conductor.getNombre() +"  Camion matricula : "+ camion.getMatricula()
			+ " Remolque matricula : "+ remolque.getMatricula() + "\n"
			+ " Carga: " + carga.getTipo() + " Origen: "+ origen.getDireccion()+" Destino: "+destino.getDireccion()+"\n \n";
			
		}
		
		
		
		
		return resultado;
	}
	*/
}
