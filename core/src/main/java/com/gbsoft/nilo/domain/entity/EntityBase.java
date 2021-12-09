package com.gbsoft.nilo.domain.entity;

import com.gbsoft.nilo.events.Auditable;
import lombok.Data;

import java.io.Serializable;

@Data
public abstract class EntityBase<S extends Serializable> implements Serializable, Auditable, Identifiable<S> {
    protected S uid;

    @Override
    public S getId() {
        return uid;
    }
}
