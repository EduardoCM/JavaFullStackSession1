package com.codigorupestre.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//expone a internet el codigo

@CrossOrigin(origins = "*")
@RestController
//especifica la ruta a exponer
@RequestMapping("/api/v1/JustoMendoza")
public class JustoMendozaAPI 
{
	static List <Microchips> existencias = new ArrayList<>();
	static {
		Microchips microchip1 = new Microchips();
		microchip1.Cores = 5;
		microchip1.Generacion ="11ava";
		microchip1.Linea="HX";
		microchip1.Nombre="Intel";
		microchip1.Precio= 1500;
		
		Microchips microchip2 = new Microchips();
		microchip2.Cores = 2;
		microchip2.Generacion ="7ma";
		microchip2.Linea="XE";
		microchip2.Nombre="Intel";
		microchip2.Precio= 1900;
		
		
		Microchips microchip3 = new Microchips();
		microchip3.Cores = 10;
		microchip3.Generacion ="13ava";
		microchip3.Linea="XE";
		microchip3.Nombre="Intel";
		microchip3.Precio= 10000;
		
		existencias.add(microchip1);
		existencias.add(microchip2);
		existencias.add(microchip3);
	}
	//Obtener informacion
	@GetMapping
	public List <Microchips> consultarExistencias() {
		return existencias;
	}
	@PostMapping
	public void agregarProducto(@RequestBody Microchips microchips)
	{
		existencias.add(microchips);
		
	}
}
