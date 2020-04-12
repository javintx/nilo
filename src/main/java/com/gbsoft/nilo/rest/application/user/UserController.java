package com.gbsoft.nilo.rest.application.user;

import com.gbsoft.nilo.repository.application.user.entity.User;
import com.gbsoft.nilo.repository.entity.Identifiable;
import com.gbsoft.nilo.rest.ControllerBase;
import com.gbsoft.nilo.rest.application.user.dto.UserDto;

public abstract class UserController<IO extends UserDto<?>, U extends User, I extends Identifiable<?>> extends ControllerBase<IO, U, Identifiable<String>> {
}
