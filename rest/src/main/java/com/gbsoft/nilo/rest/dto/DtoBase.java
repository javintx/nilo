package com.gbsoft.nilo.rest.dto;

import com.gbsoft.nilo.repository.entity.Identifiable;

import java.io.Serializable;

public abstract class DtoBase<I extends Serializable> implements Serializable, Identifiable<I> {
}
