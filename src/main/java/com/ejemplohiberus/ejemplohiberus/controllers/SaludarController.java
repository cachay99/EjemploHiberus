package com.ejemplohiberus.ejemplohiberus.controllers;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ejemplohiberus.ejemplohiberus.entities.Persona;
import com.ejemplohiberus.ejemplohiberus.repositories.PersonaRepository;

@RestController
public class SaludarController {
	@Autowired
	PersonaRepository repo;

	@GetMapping("/saludar")
	public String saludar() {
		return "Hola mundo";
	}
	@GetMapping("/add")
	public List<Persona> insertar() {
		Persona p = new Persona();
		p.setNombre(UUID.randomUUID().toString());
		repo.save(p);
		return repo.findAll();
	}
}
