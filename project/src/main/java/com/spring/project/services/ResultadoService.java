package com.spring.project.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.project.entity.Resultado;
import com.spring.project.repositories.ResultadoRepository;

public class ResultadoService {

     @Autowired
    private static ResultadoRepository rr;

    public static List<Resultado> getResultados(int id)  {
        return rr.findBySeleccion(id);
    }  

}
