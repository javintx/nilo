package com.gbsoft.nilo.service.audit.valueobject;

import com.gbsoft.nilo.repository.application.user.entity.User;
import com.gbsoft.nilo.repository.audit.entity.AuditType;

public class ReadAuditEvent extends AuditEvent {

    protected ReadAuditEvent(User user) {
        super(user);
    }

    @Override
    public String getInitialAuditInfo() {
        return null;
    }

    @Override
    public String getModifiedAuditInfo() {
        return null;
    }

    @Override
    public AuditType getType() {
        return AuditType.READ;
    }
}
