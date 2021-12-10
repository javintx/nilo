package com.gbsoft.nilo.mapper;

import com.gbsoft.nilo.domain.entity.EntityBase;
import com.gbsoft.nilo.dto.DtoBase;

import java.io.Serializable;

public abstract class MapperBase<IO extends DtoBase<? extends Serializable>, E extends EntityBase<? extends Serializable>> implements Mapper<IO, E> {
}
