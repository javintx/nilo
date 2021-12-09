package com.gbsoft.nilo.domain.application.alert;

import com.gbsoft.nilo.domain.entity.EntityBase;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class AlertType extends EntityBase<String> {
    private String name;
    private String description;
}
