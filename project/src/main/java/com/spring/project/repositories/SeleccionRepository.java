package com.spring.project.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.project.entity.Seleccion;

public interface SeleccionRepository extends JpaRepository<Seleccion, Integer> {
    
    List<Seleccion> findByGrupo(String grupo);
}