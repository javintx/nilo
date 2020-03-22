package com.gbsoft.nilo.repository.entity.playschool;

import com.gbsoft.nilo.repository.entity.EntityBase;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import java.util.Collection;

@EqualsAndHashCode(callSuper = true)
@Data
public class Center extends EntityBase<String> {
    @Column
    private String name;
    @Column
    private Manager manager;

    private Collection<Teacher> teachers;

    private Collection<Classroom> classrooms;
}
