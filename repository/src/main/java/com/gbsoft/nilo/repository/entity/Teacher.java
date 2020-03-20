package com.gbsoft.nilo.repository.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Collection;

@Entity
public class Teacher extends User {
    @Column
    private Collection<Clazz> clazzes;
    @Column
    private Collection<Center> centers;
}
