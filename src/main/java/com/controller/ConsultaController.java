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
	
		
	
	@PostMapping(value="cargascomplejo")
	public List<ConsultaModeloCompleja> consulta_grande_compleja(@RequestParam int max, @RequestParam String marca) {
		
		List<Carga> listacargas = this.cargaRepository.findByPesoGreaterThan(max);
		
		List<Remolque> listaremolque= this.remolqueRepository.findByMarca(marca);
		
		Carga carga_aux;
		
		Remolque r_aux;
		
		List<ConsultaModeloCompleja> cs = new ArrayList();
		
		ConsultaModeloCompleja cons ;
		
		OrigenDestino origen ;
		OrigenDestino destino ;
		List<Viaje> viaje ;
		Optional<Camion> camion ;
		Conductor conductor;
		
		
		for(int i = 0; i <listacargas.size(); i++) {
			
			carga_aux =listacargas.remove(i);
			
			for(int j = 0; j< listaremolque.size();j++) {
				if(listaremolque.get(j).getIdcarga()==carga_aux.getCodigo()) {
					r_aux = listaremolque.remove(j);
					
					
					origen = this.orepository.findByDireccion(carga_aux.getIdorigen());
					destino = this.orepository.findByDireccion(carga_aux.getIddestino());
					viaje = this.viajeRepository.findByIdremolque(r_aux.getMatricula());
					
					cons = new ConsultaModeloCompleja();
					
					cons.setCarga_codigo(carga_aux.getCodigo());
					cons.setCarga_peso(carga_aux.getPeso());
					cons.setCarga_tipo(carga_aux.getTipo());
					cons.setDestino(destino.getDireccion());
					cons.setOrigen(origen.getDireccion());
					cons.setMarca_remolque(r_aux.getMarca());
					cons.setMatricula_camion(viaje.get(0).getIdcamion());
					cons.setMatricula_remolque(viaje.get(0).getIdremolque());
					
					
					
					cs.add(cons);
					
					
					
				}	
			}
		}		
		
		
		return cs;
	}
	
	
	
	@PostMapping(value="cargas")
	public List<ConsultaModelo> consulta_grande(@RequestParam int max, @RequestParam String marca) {
		
		List<Carga> listacargas = this.cargaRepository.findByPesoGreaterThan(max);
		
		List<Remolque> listaremolque= this.remolqueRepository.findByMarca(marca);
		
		Carga carga_aux;
		
		Remolque r_aux;
		
		List<ConsultaModelo> cs = new ArrayList();
		
		ConsultaModelo cons ;
		
		OrigenDestino origen ;
		OrigenDestino destino ;
		Viaje viaje ;
		Optional<Camion> camion ;
		Conductor conductor;
		
		
		
		for(int i = 0; i <listacargas.size(); i++) {
			
			carga_aux =listacargas.remove(i);
			
			for(int j = 0; j< listaremolque.size();j++) {
				if(listaremolque.get(j).getIdcarga()==carga_aux.getCodigo()) {
					r_aux = listaremolque.remove(j);
					
					
					origen = this.orepository.findByDireccion(carga_aux.getIdorigen());
					destino = this.orepository.findByDireccion(carga_aux.getIddestino());
					
					
					cons = new ConsultaModelo();
					
					cons.setCargacodigo(carga_aux.getCodigo());
					cons.setCargapeso(carga_aux.getPeso());
					cons.setCargatipo(carga_aux.getTipo());
					cons.setDestino(destino.getDireccion());
					cons.setOrigen(origen.getDireccion());
					cons.setMarcaremolque(r_aux.getMarca());
					
					
					
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
