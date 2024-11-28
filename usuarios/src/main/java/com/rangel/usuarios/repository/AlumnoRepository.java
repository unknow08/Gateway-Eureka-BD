package com.rangel.usuarios.repository;

import com.rangel.common.CommonUsuario.models.entity.Alumno;
import org.springframework.data.repository.CrudRepository;

public interface AlumnoRepository extends CrudRepository<Alumno, Long> {
}
