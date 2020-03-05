package com.gbsoft.nilo.repository;

import com.gbsoft.nilo.repository.entity.EntityBase;
import com.gbsoft.nilo.repository.entity.Identifiable;
import org.springframework.data.repository.CrudRepository;

public interface RepositoryBase<I extends Identifiable<?>, E extends EntityBase<?>> extends NiloRepository<E>, CrudRepository<E, I> {
}
