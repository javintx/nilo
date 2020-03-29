package com.gbsoft.nilo.repository.application.user;

import com.gbsoft.nilo.repository.RepositoryBase;
import com.gbsoft.nilo.repository.application.user.entity.User;
import com.gbsoft.nilo.repository.entity.Identifiable;

import java.io.Serializable;

public abstract class UserRepository<I extends Identifiable<? extends Serializable>, U extends User> implements RepositoryBase<I, U> {
}
