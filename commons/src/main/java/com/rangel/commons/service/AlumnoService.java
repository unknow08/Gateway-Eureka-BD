package com.rangel.commons.service;

import com.rangel.usuarios.entity.Alumno;

import java.util.Optional;

public interface AlumnoService {
    public Iterable<Alumno> findAll();

    public Optional<Alumno> findById(Long id);

    public Alumno save(Alumno alumno);

    public void deletedById (Long id);
}
