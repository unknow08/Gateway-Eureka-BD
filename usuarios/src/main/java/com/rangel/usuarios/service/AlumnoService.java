package com.rangel.usuarios.service;

import com.rangel.common.CommonUsuario.models.entity.Alumno;
import com.rangel.commons.service.CommonService;

public interface AlumnoService extends CommonService<Alumno> {

    public Alumno save(Alumno alumno);

    public void deletedById (Long id);
}
