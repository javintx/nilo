package com.gbsoft.nilo.service.audit.valueobject;

import com.gbsoft.nilo.repository.application.user.entity.User;
import com.gbsoft.nilo.repository.audit.entity.AuditType;
import com.gbsoft.nilo.repository.audit.entity.Auditable;

public class DeleteAuditEvent extends AuditEvent {
    private final Auditable deleted;

    public DeleteAuditEvent(final Auditable deleted, final User user) {
        super(user);
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
