package com.rangel.usuarios.service;

import com.rangel.commons.service.CommonService;
import com.rangel.usuarios.entity.Alumno;

public interface AlumnoService extends CommonService<Alumno> {

    public Alumno save(Alumno alumno);

    public void deletedById (Long id);
}
