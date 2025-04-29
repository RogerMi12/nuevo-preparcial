package com.spring.project.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "resultado")
public class Resultado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int goles;
    private int amarillas;
    private int rojas;

    @ManyToOne
    @JoinColumn(name = "partido_id")
    private Partido partido;

    @ManyToOne
    @JoinColumn(name = "seleccion_id")
    private Seleccion seleccion;

    // Getters y Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getGoles() { return goles; }
    public void setGoles(int goles) { this.goles = goles; }

    public int getAmarillas() { return amarillas; }
    public void setAmarillas(int amarillas) { this.amarillas = amarillas; }

    public int getRojas() { return rojas; }
    public void setRojas(int rojas) { this.rojas = rojas; }

    public Partido getPartido() { return partido; }
    public void setPartido(Partido partido) { this.partido = partido; }

    public Seleccion getSeleccion() { return seleccion; }
    public void setSeleccion(Seleccion seleccion) { this.seleccion = seleccion; }
}