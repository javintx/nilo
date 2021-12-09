package com.gbsoft.nilo.domain.entity;

import java.io.Serializable;

public interface Identifiable<I extends Serializable> {
    I getId();
}
