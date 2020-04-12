package com.gbsoft.nilo.service.application.user;

import com.gbsoft.nilo.repository.application.user.entity.User;
import com.gbsoft.nilo.repository.entity.Identifiable;
import com.gbsoft.nilo.service.ServiceBase;

public abstract class UserService<U extends User, I extends Identifiable<?>> extends ServiceBase<U, I> {
}
