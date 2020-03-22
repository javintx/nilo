package com.gbsoft.nilo.repository.entity.application;

import com.gbsoft.nilo.repository.entity.EntityBase;
import com.gbsoft.nilo.repository.entity.consumer.Kid;
import com.gbsoft.nilo.repository.entity.consumer.Tutor;
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
