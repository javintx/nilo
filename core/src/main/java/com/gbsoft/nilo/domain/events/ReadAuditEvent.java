package com.gbsoft.nilo.domain.events;

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
