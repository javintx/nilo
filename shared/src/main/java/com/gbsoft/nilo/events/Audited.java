package com.gbsoft.nilo.events;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Documented
public @interface Audited {
    String OBFUSCATED_VALUE = "***";

    boolean obfuscated() default false;
}
