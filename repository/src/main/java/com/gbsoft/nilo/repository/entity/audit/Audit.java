package com.gbsoft.nilo.repository.entity.audit;

import com.gbsoft.nilo.repository.entity.EntityBase;
import com.gbsoft.nilo.repository.entity.application.User;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.time.Instant;
import java.util.Collection;

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
    private User user;

    private Collection<AuditDetail> details;
}
