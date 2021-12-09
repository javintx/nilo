package com.gbsoft.nilo.application.user;

import com.gbsoft.nilo.ControllerBase;
import com.gbsoft.nilo.application.user.dto.UserDto;
import com.gbsoft.nilo.application.user.entity.User;
import com.gbsoft.nilo.repository.entity.Identifiable;

public abstract class UserController<IO extends UserDto<?>, U extends User, I extends Identifiable<?>> extends ControllerBase<IO, U, Identifiable<String>> {
}
