package com.gbsoft.nilo.repository;

import com.gbsoft.nilo.repository.entity.EntityBase;
import com.gbsoft.nilo.repository.entity.Identifiable;
import org.springframework.data.repository.CrudRepository;

import java.io.Serializable;

public interface RepositoryBase<I extends Identifiable<? extends Serializable>, E extends EntityBase<? extends Serializable>> extends NiloRepository<E>, CrudRepository<E, I> {
}
