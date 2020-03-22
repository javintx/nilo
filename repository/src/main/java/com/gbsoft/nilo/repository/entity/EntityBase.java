package com.gbsoft.nilo.repository.entity;

import lombok.Data;

import javax.persistence.Column;
import java.io.Serializable;

@Data
public abstract class EntityBase<S extends Serializable> implements Serializable, Identifiable<S> {
    @Column
    private S uid;

    @Override
    public S getId() {
        return uid;
    }
}
