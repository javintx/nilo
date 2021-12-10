package com.gbsoft.nilo.dto;

import com.gbsoft.nilo.domain.entity.Identifiable;

import java.io.Serializable;

public abstract class DtoBase<I extends Serializable> implements Serializable, Identifiable<I> {
    private I uid;

    @Override
    public I getId() {
        return uid;
    }
}
