package com.spring.project.entity;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
@Table(name="resultado")
public class Resultado {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;


    
    @JoinColumn(name="partido_id")
	private Integer partidoID;

    
    @JoinColumn(name="seleccion_id")
    private Integer seleccionID;
    
    private Integer goles;
    private Integer amarillas;
    private Integer rojas;

}

