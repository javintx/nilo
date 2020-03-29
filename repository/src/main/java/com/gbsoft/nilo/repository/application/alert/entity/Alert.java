package com.gbsoft.nilo.repository.application.alert.entity;

import com.gbsoft.nilo.repository.consumer.Kid;
import com.gbsoft.nilo.repository.consumer.Tutor;
import com.gbsoft.nilo.repository.entity.EntityBase;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.time.Instant;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Alert extends EntityBase<String> {
    @Column
    private Tutor tutor;
    @Column
    private Kid kid;
    @Column
    private AlertType type;
    @Column
    private String message;
    @Column
    private Instant instant;
}
