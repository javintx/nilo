package com.gbsoft.nilo.repository.application.user.entity;

import com.gbsoft.nilo.repository.application.language.entity.Language;
import com.gbsoft.nilo.repository.entity.EntityBase;
import com.gbsoft.nilo.service.audit.events.Auditable;
import com.gbsoft.nilo.service.audit.events.Audited;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.ManyToOne;
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
    @ManyToOne
    private Language language;
    @Embedded
    private UserContactInformation contactInformation;

    public abstract UserType getType();
}
