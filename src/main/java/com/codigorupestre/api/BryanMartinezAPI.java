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
@RestController //poner_elproyecto_expuesto_a_internet
@RequestMapping("/api/v1/BryanMartinez") //Para_saber_como_acceder_a_internet_por_la_ruta
public class BryanMartinezAPI  {
	
	static List<AltavocesJBL> existencia= new ArrayList<>();
	static {
		AltavocesJBL JBL = new AltavocesJBL();
		JBL.modelo="JBL Go 3";
		JBL.color="Negro";
		JBL.precio=600;
		
		AltavocesJBL JBL1= new AltavocesJBL();
		JBL1.modelo="JBL Charge 5";
		JBL1.color="Azul";
		JBL1.precio=2100;
		
		AltavocesJBL JBL2 = new AltavocesJBL();
		JBL2.modelo="JBL Boombox 2";
		JBL2.color="Negro";
		JBL2.precio= 8999;
		
		AltavocesJBL JBL3 = new AltavocesJBL();
		JBL3.modelo= "JBL Quantum DUO";
		JBL3.color="Rojo";
		JBL3.precio=630;
		
		AltavocesJBL JBL4 = new AltavocesJBL();
		JBL4.modelo="JBL Partybox 310MC";
		JBL4.color="Morado";
		JBL4.precio=8300;
		
		existencia.add(JBL);
		existencia.add(JBL1);
		existencia.add(JBL2);
		existencia.add(JBL3);		
		existencia.add(JBL4);
	}
	
	@GetMapping //Para_Obtener_Informacion
	public List<AltavocesJBL> consultarExistencia(){

		return existencia;
	}
	@PostMapping //Para_crear_recursos
	public void AgregarProducto(@RequestBody AltavocesJBL Altavoces)
	{
		existencia.add(Altavoces);
	}

}
