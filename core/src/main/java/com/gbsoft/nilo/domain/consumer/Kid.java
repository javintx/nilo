package com.gbsoft.nilo.domain.consumer;

import com.gbsoft.nilo.domain.entity.EntityBase;
import com.gbsoft.nilo.domain.playschool.Classroom;
import com.gbsoft.nilo.events.Auditable;
import com.gbsoft.nilo.events.Audited;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;
import java.util.Collection;

@EqualsAndHashCode(callSuper = true)
@Data
public class Kid extends EntityBase<String> implements Auditable {
    @Audited
    private String name;
    @Audited
    private LocalDate birthday;
    private Collection<Tutor> tutors;
    private Classroom classroom;
}
