package com.gbsoft.nilo.repository;

import com.gbsoft.nilo.repository.entity.EntityBase;
import com.gbsoft.nilo.repository.entity.Identifiable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface RepositoryBase<E extends EntityBase<?>, I extends Identifiable<?>> extends JpaRepository<E, I> {
}
