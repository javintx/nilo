package com.gbsoft.nilo.service;

import com.gbsoft.nilo.repository.RepositoryBase;
import com.gbsoft.nilo.repository.entity.EntityBase;
import com.gbsoft.nilo.repository.entity.Identifiable;
import org.junit.Ignore;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestComponent;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@Ignore
public abstract class ServiceBaseTest<E extends EntityBase<?>, I extends Identifiable<?>> {

    @Autowired
    private ServiceBase<E, I> service;
    @MockBean
    private RepositoryBase<E, I> repository;

    @BeforeEach
    public void setUp() {
        E entity = getEntity();
        Mockito.when(repository.findById(getIdentifiable())).thenReturn(Optional.of(entity));
    }

    @Test
    public void whenRead_thenEntityShouldBeFound() {
        String uid = "uid";
        E found = service.read(getIdentifiable()).orElseThrow();
        assertThat(found.getId()).isEqualTo(uid);
    }

    protected abstract E getEntity();

    protected abstract I getIdentifiable();

}
