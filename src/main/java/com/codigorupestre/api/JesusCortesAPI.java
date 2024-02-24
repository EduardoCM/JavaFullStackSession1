package com.codigorupestre.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/jesuscortes")
public class JesusCortesAPI {
	static List<Balon> balones = new ArrayList<>();
	
	static {
		
		Balon balon1 = new Balon();
		balon1.marca = "Nike";
		balon1.size = 5;
		balon1.modelo = "todo terreno";
		balones.add(balon1);
		
		Balon balon2 = new Balon();
		balon2.marca = "Adidas";
		balon2.size = 4;
		balon2.modelo = "sintetico";
		balones.add(balon2);
		
		Balon balon3 = new Balon();
		balon3.marca = "Voit";
		balon3.size = 5;
		balon3.modelo = "pasto";
		balones.add(balon3);
		
		
	}
	
	@GetMapping
	public List<Balon> consultaExistes(){
		return balones;
	}
	
	@PostMapping
	public void agregarBalon(@RequestBody Balon unBalon) {
		balones.add(unBalon);
	}

}
