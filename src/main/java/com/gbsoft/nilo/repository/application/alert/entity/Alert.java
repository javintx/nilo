package com.gbsoft.nilo.repository.application.alert.entity;

import com.gbsoft.nilo.repository.entity.EntityBase;
import lombok.Data;
import lombok.EqualsAndHashCode;
import com.gbsoft.nilo.repository.consumer.entity.Kid;
import com.gbsoft.nilo.repository.consumer.entity.Tutor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.time.Instant;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Alert extends EntityBase<String> {
    @OneToOne
    private Tutor tutor;
    @OneToOne
    private Kid kid;
    @OneToOne
    private AlertType type;
    @Column
    private String message;
    @Column
    private Instant instant;
}
