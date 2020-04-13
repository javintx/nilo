package com.gbsoft.nilo.repository.playschool.entity;

import com.gbsoft.nilo.repository.consumer.entity.Kid;
import com.gbsoft.nilo.repository.entity.EntityBase;
import com.gbsoft.nilo.service.audit.events.Auditable;
import com.gbsoft.nilo.service.audit.events.Audited;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.Collection;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Classroom extends EntityBase<String> implements Auditable {
    @Audited
    @Column
    private String name;
    @Audited
    @ManyToOne
    private ClassroomCategory category;
    @Audited
    @ManyToOne
    private Center center;
    @ManyToMany
    private Collection<Teacher> teachers;
    @OneToMany
    private Collection<Kid> kids;
}
