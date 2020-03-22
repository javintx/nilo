package com.gbsoft.nilo.repository.entity.audit;

import com.gbsoft.nilo.repository.entity.EntityBase;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class AuditDetail extends EntityBase<String> {
    @Column
    private String from;
    @Column
    private String to;
}
