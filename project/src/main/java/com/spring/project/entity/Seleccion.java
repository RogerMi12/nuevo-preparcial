package com.spring.project.entity;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
@Table(name="selecciones")
public class Seleccion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String nombre;

	
    @JoinColumn(name="continente_id")
	private int continenteID;


	private String grupo;

}

