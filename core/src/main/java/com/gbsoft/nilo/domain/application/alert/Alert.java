package com.gbsoft.nilo.domain.application.alert;

import com.gbsoft.nilo.domain.consumer.Kid;
import com.gbsoft.nilo.domain.consumer.Tutor;
import com.gbsoft.nilo.domain.entity.EntityBase;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.Instant;

@EqualsAndHashCode(callSuper = true)
@Data
public class Alert extends EntityBase<String> {
    private Tutor tutor;
    private Kid kid;
    private AlertType type;
    private String message;
    private Instant instant;
}
