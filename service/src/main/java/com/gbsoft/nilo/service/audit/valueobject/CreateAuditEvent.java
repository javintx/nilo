package com.gbsoft.nilo.service.audit.valueobject;

import com.gbsoft.nilo.repository.application.user.entity.User;
import com.gbsoft.nilo.repository.audit.entity.AuditType;
import com.gbsoft.nilo.repository.audit.entity.Auditable;

public class CreateAuditEvent extends AuditEvent {
    private final Auditable created;

    public CreateAuditEvent(final Auditable created, final User user) {
        super(user);
        this.created = created;
    }

    @Override
    public String getInitialAuditInfo() {
        return null;
    }

    @Override
    public String getModifiedAuditInfo() {
        return getAuditInfo(created).toString();
    }

    @Override
    public AuditType getType() {
        return AuditType.CREATE;
    }
}
