package com.gbsoft.nilo.mapper;

import com.gbsoft.nilo.dto.DtoBase;
import com.gbsoft.nilo.repository.entity.EntityBase;

import java.io.Serializable;

public interface Mapper<IO extends DtoBase<? extends Serializable>, E extends EntityBase<? extends Serializable>> {
    E entity(final IO dto) throws MapperException;

    IO dto(final E entity) throws MapperException;
}
