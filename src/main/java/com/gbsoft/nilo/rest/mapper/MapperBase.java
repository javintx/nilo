package com.gbsoft.nilo.rest.mapper;

import com.gbsoft.nilo.repository.entity.EntityBase;
import com.gbsoft.nilo.rest.dto.DtoBase;

import java.io.Serializable;

public abstract class MapperBase<IO extends DtoBase<? extends Serializable>, E extends EntityBase<? extends Serializable>> implements Mapper<IO, E> {
}
