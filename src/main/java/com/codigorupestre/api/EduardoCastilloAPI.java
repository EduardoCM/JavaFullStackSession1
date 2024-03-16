package com.codigorupestre.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/eduardocastillo")
public class EduardoCastilloAPI {
	
	static List<Pan> existencias = new ArrayList<>();
	
	static {
		Pan pan1 = new Pan();
		pan1.nombre = "Polvoron";
		pan1.precio = 15;
		
		Pan pan2 = new Pan();
		pan2.nombre = "Concha";
		pan2.precio = 17;
		
		Pan pan3 = new Pan();
		pan3.nombre = "Dona Azucar";
		pan3.precio = 20;
		
		existencias.add(pan1);
		existencias.add(pan2);
		existencias.add(pan3);
	}
	@GetMapping
	public List<Pan> consultarExistencias() {
		return existencias;
	}
	
	@PostMapping
	public void agregarProducto(@RequestBody Pan pan) {
		existencias.add(pan);
	}

}
