package com.gbsoft.nilo.repository.playschool;

import com.gbsoft.nilo.repository.audit.entity.Auditable;
import com.gbsoft.nilo.repository.audit.entity.Audited;
import com.gbsoft.nilo.repository.entity.EntityBase;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
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

    private Collection<Teacher> teachers;

    private Collection<Classroom> classrooms;
}
