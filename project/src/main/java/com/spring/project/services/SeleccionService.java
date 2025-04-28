package com.spring.project.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import com.spring.project.entity.Seleccion;
import com.spring.project.repositories.SeleccionRepository;

public class SeleccionService {

     @Autowired
    private SeleccionRepository sR;

    public Seleccion crearSeleccion(Seleccion seleccion) {
        return sR.save(seleccion);
    }
    public List<Seleccion> listarSelecciones() {
        return sR.findAll();
    }

    public ResponseEntity<Seleccion> actualizarSeleccion(Seleccion seleccion, int id) throws Exception {
        Seleccion temp = sR.findById(id).orElseThrow(() -> new Exception("La seleccion con ID " + id + ", no existe."));
        temp.setNombre(seleccion.getNombre());
        temp.setContinenteID(seleccion.getContinenteID());
        temp.setGrupo(seleccion.getGrupo());
        sR.save(temp);
        return ResponseEntity.ok(temp);
    }

    public Seleccion getSeleccion(int id) throws Exception{
        Seleccion temp = sR.findById(id).orElseThrow(() -> new Exception("La seleccion con ID " + id + ", no existe."));
        return temp;
    }   

    public ResponseEntity<Seleccion> eliminarSeleccion(int id) throws Exception {
        Seleccion temp = sR.findById(id).orElseThrow(() -> new Exception("La seleccion con ID " + id + ", no existe."));
        sR.delete(temp);
        return ResponseEntity.ok(temp);
    }

    public List<Seleccion> listarGrupo(String id) {
        return sR.findByGrupo(id);
    }
}
