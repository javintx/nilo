package com.gbsoft.nilo.repository.application.language.entity;

import com.gbsoft.nilo.repository.entity.EntityBase;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Language extends EntityBase<String> {
    @Column
    private String code;
    @Column
    private String name;
    @Column
    private String description;
    @Column
    private boolean isSupported = false;
}
