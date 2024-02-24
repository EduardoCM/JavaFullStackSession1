package com.codigorupestre.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api/v1/user")
public class HelloWorldAPI {
	
	@GetMapping
	public ResponseEntity<Object> creteUser() {
        log.info("Hello World");
		
		return ResponseEntity.ok("Hello World I am expert Dos Dos Java Full Stack Developer");
	}
	
	@DeleteMapping
	public ResponseEntity<Object> eliminarUser() {
        log.info("Delete Hello World");
		
		return ResponseEntity.ok("Iam not a expert  Java Full Stack Developer");
	}

}
