package com.gbsoft.nilo.mapper;

import com.gbsoft.nilo.dto.DtoBase;
import com.gbsoft.nilo.repository.entity.EntityBase;

import java.io.Serializable;

public abstract class MapperBase<IO extends DtoBase<? extends Serializable>, E extends EntityBase<? extends Serializable>> implements Mapper<IO, E> {
}
