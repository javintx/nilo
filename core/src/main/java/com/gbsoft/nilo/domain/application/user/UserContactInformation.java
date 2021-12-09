package com.gbsoft.nilo.domain.application.user;

import com.gbsoft.nilo.domain.entity.EntityBase;
import com.gbsoft.nilo.events.Auditable;
import com.gbsoft.nilo.events.Audited;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class UserContactInformation extends EntityBase<String> implements Auditable {
    @Audited
    private String mainPhoneNumber;
    @Audited
    private String secondaryPhoneNumber;
    @Audited
    private String email;
}
