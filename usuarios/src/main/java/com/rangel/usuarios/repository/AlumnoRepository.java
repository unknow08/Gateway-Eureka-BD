package com.rangel.usuarios.repository;

import com.rangel.usuarios.entity.Alumno;
import org.springframework.data.repository.CrudRepository;

public interface AlumnoRepository extends CrudRepository<Alumno, Long> {
}
