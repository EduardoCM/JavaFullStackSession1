package com.codigorupestre.api;
import java.util.List;
import java.util.ArrayList;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/IrvinUlises")
public class IrvinUlises {
	
	static List<Computadora> existencias = new ArrayList<>();
	static {
		Computadora comp1 = new Computadora();
		comp1.id= 1;
		comp1.marca= "Dell";
		comp1.modelo= "Vostro";
		comp1.noSerie= "1XA7631937";
		comp1.procesador= "Intel Core I3";
		comp1.memoriaRam= "8Gb";
		comp1.memoriaRom= "1Tb";
		
		Computadora comp2 = new Computadora();
		comp2.id= 2;
		comp2.marca= "HP";
		comp2.modelo= "Victus";
		comp2.noSerie= "AS829832837";
		comp2.procesador= "Intel Core I7";
		comp2.memoriaRam= "16Gb";
		comp2.memoriaRom= "1Tb";
		
		Computadora comp3 = new Computadora();
		comp3.id= 3;
		comp3.marca= "Dell";
		comp3.modelo= "Precision 5374";
		comp3.noSerie= "LSK2738927";
		comp3.procesador= "AMD";
		comp3.memoriaRam= "4Gb";
		comp3.memoriaRom= "500Gb";
		
		existencias.add(comp1);
		existencias.add(comp2);
		existencias.add(comp3);
	}
	
	@GetMapping
	public List<Computadora> consultarExistencia() {	
		return existencias;
	}
	
	@PostMapping
	public void AgregarProducto(@RequestBody Computadora comp) {	
		existencias.add(comp);
	} 
}
