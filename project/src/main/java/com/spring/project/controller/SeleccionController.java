package com.spring.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.spring.project.entity.Resultado;
import com.spring.project.entity.Seleccion;
import com.spring.project.services.ResultadoService;
import com.spring.project.services.SeleccionService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;



@RestController
@RequestMapping("/selecciones")
public class SeleccionController {

    @Autowired
    private SeleccionService ss;

    @Autowired
    private ResultadoService rs;

    @PostMapping
    public Seleccion crear(@RequestBody Seleccion seleccion) {
        return ss.crearSeleccion(seleccion);
    }

    @GetMapping
    public List<Seleccion> listar() {
        return ss.listarSelecciones();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Seleccion> actualizar(@RequestBody Seleccion seleccion,@PathVariable int id) {
        try {
            ss.actualizarSeleccion(seleccion, id);
        } catch (Exception e) {            
            e.printStackTrace();
        }
        return ResponseEntity.ok(seleccion);
    }

    @GetMapping("/{id}")
    public Seleccion getSeleccion(@PathVariable int id) {
        Seleccion tmp = null;
        try {
            tmp = ss.getSeleccion(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tmp;
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable int id) {

        try {
            ss.eliminarSeleccion(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @GetMapping("/grupo/{grupo}")
    public List<Seleccion> getResultadosSeleccion(@PathVariable String grupo) {
        return ss.listarGrupo(grupo);
    }
    
    @GetMapping("/{id}/resultados")
public List<ResultadoDTO> getResultados(@PathVariable int id) {
    List<Resultado> resultados = rs.getResultadosID(id);
    List<ResultadoDTO> dtos = new ArrayList<>();

    for (Resultado r : resultados) {
        ResultadoDTO dto = new ResultadoDTO(
            r.getSeleccion().getNombre(),  // Nombre de la selección
            r.getGoles(),
            r.getAmarillas(),
            r.getRojas()
        );
        dtos.add(dto);
    }

    return dtos;
}
    


}
