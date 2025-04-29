package com.spring.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.spring.project.entity.Estadio;

public interface EstadioRepository extends JpaRepository<Estadio, Integer> {
}