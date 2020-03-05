package com.gbsoft.nilo.rest.mapper;

import com.gbsoft.nilo.repository.entity.EntityBase;
import com.gbsoft.nilo.rest.dto.DtoBase;

public abstract class MapperBase<IO extends DtoBase<?>, E extends EntityBase<?>> implements Mapper<IO, E> {
}
