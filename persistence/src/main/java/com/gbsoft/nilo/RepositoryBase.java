package com.gbsoft.nilo;

import com.gbsoft.nilo.domain.entity.EntityBase;
import com.gbsoft.nilo.domain.entity.Identifiable;
import com.gbsoft.nilo.service.port.out.ReadRepositoryBase;
import com.gbsoft.nilo.service.port.out.WriteRepositoryBase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface RepositoryBase<E extends EntityBase<?>, I extends Identifiable<?>> extends JpaRepository<E, I>, ReadRepositoryBase<E, I>, WriteRepositoryBase<E, I> {
}
