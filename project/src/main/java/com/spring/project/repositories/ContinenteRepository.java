package com.spring.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.spring.project.entity.Continente;

public interface ContinenteRepository extends JpaRepository<Continente, Integer> {
}