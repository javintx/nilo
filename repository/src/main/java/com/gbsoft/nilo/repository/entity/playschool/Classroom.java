package com.gbsoft.nilo.repository.entity.playschool;

import com.gbsoft.nilo.repository.entity.EntityBase;
import com.gbsoft.nilo.repository.entity.consumer.Kid;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import java.util.Collection;

@EqualsAndHashCode(callSuper = true)
@Data
public class Classroom extends EntityBase<String> {
    @Column
    private String name;
    @Column
    private ClassroomCategory category;
    @Column
    private Center center;

    private Collection<Teacher> teachers;

    private Collection<Kid> kids;
}
