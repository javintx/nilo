package com.gbsoft.nilo.service.audit.events;

import com.gbsoft.nilo.repository.audit.entity.AuditType;

public class ReadAuditEvent extends AuditEvent {

    public ReadAuditEvent(String originator) {
        super(originator);
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
