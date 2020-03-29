package com.gbsoft.nilo.repository.consumer;

import com.gbsoft.nilo.repository.audit.entity.Auditable;
import com.gbsoft.nilo.repository.audit.entity.Audited;
import com.gbsoft.nilo.repository.entity.EntityBase;
import com.gbsoft.nilo.repository.playschool.Classroom;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
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

    private Collection<Tutor> tutors;

    private Classroom classroom;

}
