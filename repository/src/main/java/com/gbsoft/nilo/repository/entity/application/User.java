package com.gbsoft.nilo.repository.entity.application;

import com.gbsoft.nilo.repository.entity.EntityBase;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import java.util.Calendar;

@EqualsAndHashCode(callSuper = true)
@Data
public abstract class User extends EntityBase<String> {
    @Column
    private String user;
    @Column
    private String password;
    @Column
    private Calendar creation;
    @Column
    private Calendar deletion;
    @Column
    private Language language;

    private UserContactInformation contactInformation;

    public abstract UserType getType();
}
