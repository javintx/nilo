package com.gbsoft.nilo.repository.playschool.entity;

import com.gbsoft.nilo.service.audit.events.Auditable;
import com.gbsoft.nilo.service.audit.events.Audited;
import com.gbsoft.nilo.repository.consumer.entity.Kid;
import com.gbsoft.nilo.repository.entity.EntityBase;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.util.Collection;

@EqualsAndHashCode(callSuper = true)
@Data
public class Classroom extends EntityBase<String> implements Auditable {
    @Audited
    @Column
    private String name;
    @Audited
    @OneToOne
    private ClassroomCategory category;
    @Audited
    @Column
    private Center center;
    @ManyToMany
    private Collection<Teacher> teachers;
    @ManyToOne
    private Collection<Kid> kids;
}
