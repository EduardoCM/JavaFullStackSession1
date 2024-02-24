package com.codigorupestre.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/JosueZaragoza")

public class JosueZaragozaAPI {
	
	static List<PanCero> existencias = new ArrayList<>();
	
	static {
       PanCero pan1 = new PanCero();
		pan1.nombre = "Dona";
		pan1.precio = 22;
		
		PanCero pan2 = new PanCero();
		pan2.nombre ="Concha";
		pan2.precio =22;
		
		PanCero pan3 = new PanCero();
		pan3.nombre ="Oreja";
		pan3.precio =22;
		
		existencias.add(pan1);
		existencias.add(pan2);
		existencias.add(pan3);
	}
	
	@GetMapping
	public List<PanCero> consultarPoroducto() {
		
		return existencias;
	}
	
	
	@PostMapping
	public void AgrgarPodructo(@RequestBody PanCero pan) {
		existencias.add(pan);
		
	}

}
