package com.rangel.commons.service;

import java.util.Optional;

public interface AlumnoService<E> {
    public Iterable<E> findAll();

    public Optional<E> findById(Long id);

    public E save(E entity);

    public void deletedById (Long id);
}
