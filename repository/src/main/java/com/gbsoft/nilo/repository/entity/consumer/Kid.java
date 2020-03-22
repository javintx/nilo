package com.gbsoft.nilo.repository.entity.consumer;

import com.gbsoft.nilo.repository.entity.EntityBase;
import com.gbsoft.nilo.repository.entity.playschool.Classroom;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.time.LocalDate;
import java.util.Collection;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Kid extends EntityBase<String> {
    @Column
    private String name;
    @Column
    private LocalDate birthday;

    private Collection<Tutor> tutors;

    private Classroom classroom;
}
