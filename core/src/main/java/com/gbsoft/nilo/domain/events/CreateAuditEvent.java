package com.gbsoft.nilo.domain.events;

import com.gbsoft.nilo.events.Auditable;

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
