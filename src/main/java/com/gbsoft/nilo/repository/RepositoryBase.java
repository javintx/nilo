package com.gbsoft.nilo.repository;

import com.gbsoft.nilo.repository.entity.EntityBase;
import com.gbsoft.nilo.repository.entity.Identifiable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public abstract class RepositoryBase<D extends Serializable, E extends EntityBase<D>> implements JpaRepository<E, Identifiable<?>> {
}
