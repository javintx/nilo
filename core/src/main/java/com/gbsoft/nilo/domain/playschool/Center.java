package com.gbsoft.nilo.domain.playschool;

import com.gbsoft.nilo.domain.entity.EntityBase;
import com.gbsoft.nilo.events.Auditable;
import com.gbsoft.nilo.events.Audited;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Collection;

@EqualsAndHashCode(callSuper = true)
@Data
public class Center extends EntityBase<String> implements Auditable {
    @Audited
    private String name;
    @Audited
    private Collection<Manager> manager;
    private Collection<Teacher> teachers;
    private Collection<Classroom> classrooms;
}
