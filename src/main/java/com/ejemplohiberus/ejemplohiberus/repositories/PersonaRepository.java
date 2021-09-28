package com.ejemplohiberus.ejemplohiberus.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ejemplohiberus.ejemplohiberus.entities.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Integer>{

}
