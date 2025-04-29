package com.spring.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.spring.project.entity.Partido;

public interface PartidoRepository extends JpaRepository<Partido, Integer> {
}