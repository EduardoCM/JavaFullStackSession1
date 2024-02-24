package com.codigorupestre.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/user")
public class HelloWorldAPI {
	
	@GetMapping
	public ResponseEntity<Object> creteUser() {
        System.out.println("Hello World I am expert Full Stack");
		
		return ResponseEntity.ok("Hello World I am expert Dos Dos Java Full Stack Developer");
	}
	
	@DeleteMapping
	public ResponseEntity<Object> eliminarUser() {
        System.out.println("By Iam not a expert full Stack");
		
		return ResponseEntity.ok("Iam not a expert  Java Full Stack Developer");
	}

}
