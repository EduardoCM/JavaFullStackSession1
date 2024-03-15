package com.codigorupestre.api;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;



@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/LuisEnrique")
public class LuisEnriqueAppi {

		static	List<Pan_Bimbo> existencias = new ArrayList<>();
		
		static {
			Pan_Bimbo pan2= new Pan_Bimbo();
			pan2.name = "Donitas";
			pan2.precio = 20;
			
			Pan_Bimbo pan3= new Pan_Bimbo();
			pan3.name = "Integral";
			pan3.precio = 42;
			
			Pan_Bimbo pan4= new Pan_Bimbo();
			pan4.name = "Negrito";
			pan4.precio = 28;
			
			Pan_Bimbo pan5= new Pan_Bimbo();
			pan5.name = "Panque";
			pan5.precio = 18;
			
			Pan_Bimbo pan6= new Pan_Bimbo();
			pan6.name = "Mantecadas";
			pan6.precio = 22;

			existencias.add(pan2);
			existencias.add(pan3);
			existencias.add(pan4);
			existencias.add(pan5);
			existencias.add(pan6);
		}

		
		 
		
		@GetMapping
		public List<Pan_Bimbo>ConsultarExcistencias() {
			return existencias;
		}
		
		@PostMapping
		public void agregarProducto(@RequestBody Pan_Bimbo pan) {
			
			existencias.add(pan);
			
		
	}

	
}
