package com.gbsoft.nilo.rest.mapper;

import com.gbsoft.nilo.repository.entity.EntityBase;
import com.gbsoft.nilo.rest.dto.DtoBase;

import java.io.Serializable;

public interface Mapper<IO extends DtoBase<? extends Serializable>, E extends EntityBase<? extends Serializable>> {
    E entity(final IO dto) throws MapperException;

    IO dto(final E entity) throws MapperException;
}
