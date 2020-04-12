package com.gbsoft.nilo.repository.playschool.entity;

import com.gbsoft.nilo.service.audit.events.Auditable;
import com.gbsoft.nilo.service.audit.events.Audited;
import com.gbsoft.nilo.repository.entity.EntityBase;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.Collection;

@EqualsAndHashCode(callSuper = true)
@Data
public class Center extends EntityBase<String> implements Auditable {
    @Audited
    @Column
    private String name;
    @Audited
    @Column
    private Manager manager;
    @ManyToMany
    private Collection<Teacher> teachers;
    @ManyToOne
    private Collection<Classroom> classrooms;
}
