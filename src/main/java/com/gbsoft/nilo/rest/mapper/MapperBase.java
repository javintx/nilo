package com.gbsoft.nilo.rest.mapper;

import com.gbsoft.nilo.repository.entity.EntityBase;
import com.gbsoft.nilo.rest.dto.DtoBase;

public class MapperBase<IO extends DtoBase<?>, E extends EntityBase<?>> {
    public E entity(final IO dto) {
        throw new RuntimeException("Method not implemented yet");
    }

    public IO dto(final E entity) {
        throw new RuntimeException("Method not implemented yet");
    }
}
