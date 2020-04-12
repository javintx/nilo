package com.gbsoft.nilo.service.audit.events;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Documented
public @interface Audited {
    String OBFUSCATED_VALUE = "***";

    boolean obfuscated() default false;
}
