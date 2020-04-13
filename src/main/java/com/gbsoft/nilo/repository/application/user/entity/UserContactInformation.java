package com.gbsoft.nilo.repository.application.user.entity;

import com.gbsoft.nilo.repository.entity.EntityBase;
import com.gbsoft.nilo.service.audit.events.Auditable;
import com.gbsoft.nilo.service.audit.events.Audited;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@EqualsAndHashCode(callSuper = true)
@Data
@Embeddable
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
