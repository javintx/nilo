package com.gbsoft.nilo.repository.consumer.entity;

import com.gbsoft.nilo.repository.entity.EntityBase;
import com.gbsoft.nilo.repository.playschool.entity.Classroom;
import com.gbsoft.nilo.service.audit.events.Auditable;
import com.gbsoft.nilo.service.audit.events.Audited;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.time.LocalDate;
import java.util.Collection;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Kid extends EntityBase<String> implements Auditable {
    @Audited
    @Column
    private String name;
    @Audited
    @Column
    private LocalDate birthday;
    @ManyToMany
    private Collection<Tutor> tutors;
    @ManyToOne
    private Classroom classroom;
}
