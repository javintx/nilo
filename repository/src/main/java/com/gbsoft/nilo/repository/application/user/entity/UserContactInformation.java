package com.gbsoft.nilo.repository.application.user.entity;

import com.gbsoft.nilo.repository.audit.entity.Auditable;
import com.gbsoft.nilo.repository.audit.entity.Audited;
import com.gbsoft.nilo.repository.entity.EntityBase;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class UserContactInformation extends EntityBase<String> implements Auditable {
    @Audited
    @Column
    private String mainPhoneNumber;
    @Audited
    @Column
    private String secondaryPhoneNumber;
    @Audited
    @Column
    private String email;
}
