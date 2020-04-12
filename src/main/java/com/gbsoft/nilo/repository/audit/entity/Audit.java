package com.gbsoft.nilo.repository.audit.entity;

import com.gbsoft.nilo.repository.entity.EntityBase;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.time.Instant;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Audit extends EntityBase<String> {
    @Column
    private Instant instant;
    @Column
    private String entity;
    @Column
    private AuditType type;
    @Column
    private String originator;
    @Column
    private String from;
    @Column
    private String to;
}
