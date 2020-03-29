package com.gbsoft.nilo.repository.application.user.entity;

import com.gbsoft.nilo.repository.application.language.entity.Language;
import com.gbsoft.nilo.repository.audit.entity.Auditable;
import com.gbsoft.nilo.repository.audit.entity.Audited;
import com.gbsoft.nilo.repository.entity.EntityBase;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import java.util.Calendar;

@EqualsAndHashCode(callSuper = true)
@Data
public abstract class User extends EntityBase<String> implements Auditable {
    @Audited
    @Column
    private String name;
    @Audited(obfuscated = true)
    @Column
    private String password;
    @Audited
    @Column
    private Calendar creation;
    @Audited
    @Column
    private Calendar deletion;
    @Audited
    @Column
    private Language language;

    private UserContactInformation contactInformation;

    public abstract UserType getType();
}
