package com.gbsoft.nilo.service.audit.events;

import com.gbsoft.nilo.repository.audit.entity.AuditType;

public class CreateAuditEvent extends AuditEvent {
    private final Auditable created;

    public CreateAuditEvent(final Auditable created, final String originator) {
        super(originator);
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
