package com.gbsoft.nilo.domain.application.user;

import com.gbsoft.nilo.domain.application.language.Language;
import com.gbsoft.nilo.domain.entity.EntityBase;
import com.gbsoft.nilo.events.Auditable;
import com.gbsoft.nilo.events.Audited;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Calendar;

@EqualsAndHashCode(callSuper = true)
@Data
public abstract class User extends EntityBase<String> implements Auditable {
    @Audited
    private String name;
    @Audited(obfuscated = true)
    private String password;
    @Audited
    private Calendar creation;
    @Audited
    private Calendar deletion;
    @Audited
    private Language language;
    private UserContactInformation contactInformation;

    public abstract UserType getType();
}
