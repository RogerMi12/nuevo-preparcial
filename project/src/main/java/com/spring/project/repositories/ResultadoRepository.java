package com.spring.project.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.project.entity.Resultado;

public interface ResultadoRepository extends JpaRepository<Resultado, Integer> {

    public List<Resultado> findBySeleccionID(int seleccionID);

}