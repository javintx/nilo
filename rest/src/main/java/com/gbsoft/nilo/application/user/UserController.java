package com.gbsoft.nilo.application.user;

import com.gbsoft.nilo.ControllerBase;
import com.gbsoft.nilo.application.user.dto.UserDto;
import com.gbsoft.nilo.domain.application.user.User;
import com.gbsoft.nilo.domain.entity.Identifiable;
import com.gbsoft.nilo.mapper.MapperBase;
import com.gbsoft.nilo.service.ServiceBase;

import java.util.logging.Logger;

public abstract class UserController<IO extends UserDto<?>, U extends User, I extends Identifiable<?>> extends ControllerBase<IO, U, Identifiable<String>> {
    public UserController(Logger LOGGER, ServiceBase<U, Identifiable<String>> service, MapperBase<IO, U> mapper) {
        super(LOGGER, service, mapper);
    }
}
