package com.gbsoft.nilo.domain.events;

import com.gbsoft.nilo.events.Auditable;

public class DeleteAuditEvent extends AuditEvent {
    private final Auditable deleted;

    public DeleteAuditEvent(final Auditable deleted, final String originator) {
        super(originator);
        this.deleted = deleted;
    }

    @Override
    public String getInitialAuditInfo() {
        return getAuditInfo(deleted).toString();
    }

    @Override
    public String getModifiedAuditInfo() {
        return null;
    }

    @Override
    public AuditType getType() {
        return AuditType.DELETE;
    }
}
