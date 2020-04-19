package com.gbsoft.nilo.repository;

import com.gbsoft.nilo.repository.entity.EntityBase;
import com.gbsoft.nilo.repository.entity.Identifiable;
import org.junit.Ignore;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import static org.assertj.core.api.Assertions.assertThat;

@Ignore
@DataJpaTest
public abstract class RepositoryBaseTest<E extends EntityBase<?>, I extends Identifiable<?>> {
    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private RepositoryBase<E, I> repositoryBase;

    @Test
    public void whenFindById_thenReturnEntity() {
        // given
        E entity = getEntity();
        entityManager.persist(entity);
        entityManager.flush();

        // when
        E found = repositoryBase.findById(getIdentifiable()).orElseThrow();

        // then
        assertThat(found).isEqualTo(entity);
    }

    protected abstract E getEntity();

    protected abstract I getIdentifiable();

}
