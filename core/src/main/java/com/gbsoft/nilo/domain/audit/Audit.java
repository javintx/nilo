package com.gbsoft.nilo.domain.audit;

import com.gbsoft.nilo.domain.entity.EntityBase;
import com.gbsoft.nilo.domain.events.AuditType;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.Instant;

@EqualsAndHashCode(callSuper = true)
@Data
public class Audit extends EntityBase<String> {
    private Instant instant;
    private String entity;
    private AuditType type;
    private String originator;
    private String original;
    private String modified;
}
