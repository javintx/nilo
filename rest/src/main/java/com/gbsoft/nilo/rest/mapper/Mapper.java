package com.gbsoft.nilo.rest.mapper;

import com.gbsoft.nilo.repository.entity.EntityBase;
import com.gbsoft.nilo.rest.dto.DtoBase;

public interface Mapper<IO extends DtoBase<?>, E extends EntityBase<?>> {
    E entity(final IO dto) throws MapperException;

    IO dto(final E entity) throws MapperException;
}
