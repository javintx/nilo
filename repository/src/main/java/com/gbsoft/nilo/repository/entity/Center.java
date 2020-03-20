package com.gbsoft.nilo.repository.entity;

import lombok.Data;

import javax.persistence.Column;
import java.util.Collection;

@Data
public class Center extends EntityBase<String> {
    @Column
    private String uid;
    @Column
    private String name;
    @Column
    private Manager manager;

    private Collection<Teacher> teachers;

    private Collection<Clazz> clazzes;

    @Override
    public String getId() {
        return uid;
    }

}
