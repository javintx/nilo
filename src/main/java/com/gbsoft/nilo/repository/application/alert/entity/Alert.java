package com.gbsoft.nilo.repository.application.alert.entity;

import com.gbsoft.nilo.repository.consumer.entity.Kid;
import com.gbsoft.nilo.repository.consumer.entity.Tutor;
import com.gbsoft.nilo.repository.entity.EntityBase;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.time.Instant;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Alert extends EntityBase<String> {
    @ManyToOne
    private Tutor tutor;
    @ManyToOne
    private Kid kid;
    @ManyToOne
    private AlertType type;
    @Column
    private String message;
    @Column
    private Instant instant;
}
