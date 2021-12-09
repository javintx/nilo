package com.gbsoft.nilo.domain.playschool;

import com.gbsoft.nilo.domain.entity.EntityBase;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class ClassroomCategory extends EntityBase<String> {
    private String name;
}
