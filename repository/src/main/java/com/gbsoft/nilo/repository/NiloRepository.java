package com.gbsoft.nilo.repository;

import com.gbsoft.nilo.repository.entity.EntityBase;
import com.gbsoft.nilo.repository.entity.Identifiable;

import java.util.Optional;

public interface NiloRepository<E extends EntityBase<?>> {
    <S extends E> S save(S entity);

    Optional<E> findById(Identifiable<?> i);

    void delete(E entity);
}
