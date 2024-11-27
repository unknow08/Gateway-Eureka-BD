package com.rangel.curso.controller;

import com.rangel.commons.controller.CommonController;
import com.rangel.curso.models.entity.Curso;
import com.rangel.curso.service.CursoService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CursoController extends CommonController<Curso, CursoService> {
}
