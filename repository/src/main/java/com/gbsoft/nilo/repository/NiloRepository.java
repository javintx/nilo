package com.gbsoft.nilo.repository;

import com.gbsoft.nilo.repository.entity.EntityBase;
import com.gbsoft.nilo.repository.entity.Identifiable;

import java.io.Serializable;
import java.util.Optional;

public interface NiloRepository<E extends EntityBase<? extends Serializable>> {
    <S extends E> S save(E entity);

    Optional<E> findById(Identifiable<?> i);

    void delete(E entity);
}
