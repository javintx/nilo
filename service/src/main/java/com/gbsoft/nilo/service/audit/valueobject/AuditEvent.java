package com.gbsoft.nilo.service.audit.valueobject;

import com.gbsoft.nilo.repository.application.user.entity.User;
import com.gbsoft.nilo.repository.audit.entity.Audit;
import com.gbsoft.nilo.repository.audit.entity.AuditType;
import com.gbsoft.nilo.repository.audit.entity.Auditable;
import com.gbsoft.nilo.repository.audit.entity.Audited;
import lombok.Builder;
import lombok.Singular;
import lombok.Value;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;

public abstract class AuditEvent {
    private final User user;

    protected AuditEvent(final User user) {
        this.user = user;
    }

    public Audit getAudit() {
        Audit audit = new Audit();
        audit.setType(getType());
        audit.setUser(user);
        audit.setFrom(getInitialAuditInfo());
        audit.setTo(getModifiedAuditInfo());
        return new Audit();
    }

    public abstract String getInitialAuditInfo();

    public abstract String getModifiedAuditInfo();

    public abstract AuditType getType();

    protected final AuditInfo getAuditInfo(final Auditable auditable) {
        Collection<AuditInfo.AuditedInfo> auditedInfo = new ArrayList<>(1);
        for (Field field : auditable.getClass().getDeclaredFields()) {
            Audited audited = field.getAnnotation(Audited.class);
            if (audited != null) {
                try {
                    auditedInfo.add(AuditInfo.AuditedInfo.builder()
                            .name(field.getName())
                            .value(audited.obfuscated() ? Audited.OBFUSCATED_VALUE : field.get(auditable).toString())
                            .build());
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
        return new AuditInfo(auditedInfo);
    }

    @Value
    protected static class AuditInfo {
        @Singular
        Collection<AuditInfo.AuditedInfo> auditedInfo;

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            for (AuditInfo.AuditedInfo info : auditedInfo) {
                sb.append(info.name).append(':').append(info.value).append("\n");
            }
            return sb.toString();
        }

        @Builder
        private static final class AuditedInfo {
            private String name;
            private String value;
        }
    }
}
