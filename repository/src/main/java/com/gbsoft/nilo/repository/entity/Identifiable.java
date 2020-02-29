package com.gbsoft.nilo.repository.entity;

import java.io.Serializable;

public interface Identifiable<I extends Serializable> {
    I getId();
}
