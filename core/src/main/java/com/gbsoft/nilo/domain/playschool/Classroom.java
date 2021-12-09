package com.gbsoft.nilo.domain.playschool;

import com.gbsoft.nilo.domain.consumer.Kid;
import com.gbsoft.nilo.domain.entity.EntityBase;
import com.gbsoft.nilo.events.Auditable;
import com.gbsoft.nilo.events.Audited;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Collection;

@EqualsAndHashCode(callSuper = true)
@Data
public class Classroom extends EntityBase<String> implements Auditable {
    @Audited
    private String name;
    @Audited
    private ClassroomCategory category;
    @Audited
    private Center center;
    private Collection<Teacher> teachers;
    private Collection<Kid> kids;
}
