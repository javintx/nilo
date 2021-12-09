package com.gbsoft.nilo.domain.events;

import com.gbsoft.nilo.events.Auditable;

public class UpdateAuditEvent extends AuditEvent {
    private final Auditable original;
    private final Auditable modified;

    public UpdateAuditEvent(final Auditable original, final Auditable modified, final String originator) {
        super(originator);
        this.original = original;
        this.modified = modified;
    }

    @Override
    public String getInitialAuditInfo() {
        return getAuditInfo(original).toString();
    }

    @Override
    public String getModifiedAuditInfo() {
        return getAuditInfo(modified).toString();
    }

    @Override
    public AuditType getType() {
        return AuditType.UPDATE;
    }
}
