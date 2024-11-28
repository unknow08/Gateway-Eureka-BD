package com.rangel.usuarios.service;


import com.rangel.common.CommonUsuario.models.entity.Alumno;
import com.rangel.usuarios.repository.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class AlumnoServiceImpl implements AlumnoService{
    @Autowired
    AlumnoRepository dao;

    @Override
    @Transactional(readOnly = true)
    public Iterable<Alumno> findAll() {
        return dao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Alumno> findById(Long id) {
        return dao.findById(id);
    }

    @Override
    @Transactional
    public Alumno save(Alumno alumno) {
        return dao.save(alumno);
    }

    @Override
    @Transactional
    public void deletedById(Long id) {
        dao.deleteById(id);
    }
}
