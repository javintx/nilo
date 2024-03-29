package com.gbsoft.nilo.repository.entity;

import com.gbsoft.nilo.service.audit.events.Auditable;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

@Data
@MappedSuperclass
public abstract class EntityBase<S extends Serializable> implements Serializable, Auditable, Identifiable<S> {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    protected S uid;

    @Override
    public S getId() {
        return uid;
    }
}
