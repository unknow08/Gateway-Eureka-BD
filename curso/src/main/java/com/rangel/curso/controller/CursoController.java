package com.rangel.curso.controller;

import com.rangel.commons.controller.CommonController;
import com.rangel.curso.models.entity.Curso;
import com.rangel.curso.service.CursoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class CursoController extends CommonController<Curso, CursoService> {

    // Ahora si compila

    @PutMapping("/{id}")
    public ResponseEntity<?> editar (@RequestBody Curso curso, @PathVariable Long id){
        Optional<Curso> ob = service.findById(id);

        if (ob.isEmpty()){
            return ResponseEntity.noContent().build();
        }

        Curso cursoDb = ob.get();
        cursoDb.setNombre(curso.getNombre());

        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(cursoDb));
    }
}
