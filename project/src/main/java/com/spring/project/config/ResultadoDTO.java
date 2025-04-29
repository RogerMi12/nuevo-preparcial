package com.spring.project.config;

public class ResultadoDTO {

    private String nombreSeleccion;
    private int goles;
    private int amarillas;
    private int rojas;

    public ResultadoDTO() {}

    public ResultadoDTO(String nombreSeleccion, int goles, int amarillas, int rojas) {
        this.nombreSeleccion = nombreSeleccion;
        this.goles = goles;
        this.amarillas = amarillas;
        this.rojas = rojas;
    }

    // Getters y Setters
    public String getNombreSeleccion() {
        return nombreSeleccion;
    }

    public void setNombreSeleccion(String nombreSeleccion) {
        this.nombreSeleccion = nombreSeleccion;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    public int getAmarillas() {
        return amarillas;
    }

    public void setAmarillas(int amarillas) {
        this.amarillas = amarillas;
    }

    public int getRojas() {
        return rojas;
    }

    public void setRojas(int rojas) {
        this.rojas = rojas;
    }
}