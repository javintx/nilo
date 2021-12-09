package com.gbsoft.nilo.domain.application.language;

import com.gbsoft.nilo.domain.entity.EntityBase;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class Language extends EntityBase<String> {
    private String code;
    private String name;
    private String description;
    private boolean isSupported = false;
}
