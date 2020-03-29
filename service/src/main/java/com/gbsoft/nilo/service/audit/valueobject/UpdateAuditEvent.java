package com.gbsoft.nilo.service.audit.valueobject;

import com.gbsoft.nilo.repository.application.user.entity.User;
import com.gbsoft.nilo.repository.audit.entity.AuditType;
import com.gbsoft.nilo.repository.audit.entity.Auditable;

public class UpdateAuditEvent extends AuditEvent {
    private final Auditable original;
    private final Auditable modified;

    public UpdateAuditEvent(final Auditable original, final Auditable modified, final User user) {
        super(user);
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
