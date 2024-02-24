package com.codigorupestre.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController //Para-exponer-a-internet
@RequestMapping("/api/v1/VeronicaRomualdo") //Para-saber-como-accede-(ruta)
public class VeronicaRomualdoAPI {
	
	static List<Guitarras> existencias = new ArrayList<>();
	static { 
		Guitarras guitarra = new Guitarras();
		guitarra.precio = 800;
		guitarra.color ="cafe";
		guitarra.tipo ="electrica";
		guitarra.cuerdas ="Nylon";
		
		Guitarras guitarra1 = new Guitarras();
		guitarra1.precio = 1000;
		guitarra1.color ="negro";
		guitarra1.tipo ="acustica";
		guitarra1.cuerdas ="Nylon";
		
		Guitarras guitarra2 = new Guitarras();
		guitarra2.precio = 2300;
		guitarra2.color ="Azul";
		guitarra2.tipo ="Clasica";
		guitarra2.cuerdas ="Acero inoxidable";
		
		existencias.add(guitarra);
		existencias.add(guitarra1);
		existencias.add(guitarra2);
		
	}
	
		@GetMapping //para-obtener-recursos
		public List<Guitarras> consultarExistencias() {
			return existencias;
		}
		
		@PostMapping //Para-crear-recursos
		public void agregarproducto(@RequestBody Guitarras guitarra) {
			existencias.add(guitarra);
		}
	}
