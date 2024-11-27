package com.rangel.commons.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class AlumnoServiceImpl<E, R extends CrudRepository<E,Long>> implements AlumnoService{
    @Autowired
    R dao;

    @Override
    @Transactional(readOnly = true)
    public Iterable<E> findAll() {
        return dao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<E> findById(Long id) {
        return dao.findById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public E save(E entity) {
        return dao.save(entity);
    }

    @Override
    @Transactional(readOnly = true)
    public void deletedById(Long id) {
        dao.deleteById(id);
    }
}
