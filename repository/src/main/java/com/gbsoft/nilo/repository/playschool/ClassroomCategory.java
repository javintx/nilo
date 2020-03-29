package com.gbsoft.nilo.repository.playschool;

import com.gbsoft.nilo.repository.entity.EntityBase;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;

@EqualsAndHashCode(callSuper = true)
@Data
public class ClassroomCategory extends EntityBase<String> {
    @Column
    private String name;
}
