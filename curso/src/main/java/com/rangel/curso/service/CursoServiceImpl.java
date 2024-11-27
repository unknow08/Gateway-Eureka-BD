package com.rangel.curso.service;

import com.rangel.commons.service.CommonService;
import com.rangel.commons.service.CommonServiceImpl;
import com.rangel.curso.models.entity.Curso;
import com.rangel.curso.repository.CursoRepository;
import org.springframework.stereotype.Service;

@Service
public class CursoServiceImpl extends CommonServiceImpl<Curso, CursoRepository> implements CommonService<Curso> {
}
