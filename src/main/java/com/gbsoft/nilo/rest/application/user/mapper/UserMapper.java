package com.gbsoft.nilo.rest.application.user.mapper;

import com.gbsoft.nilo.repository.application.user.entity.User;
import com.gbsoft.nilo.rest.application.user.dto.UserDto;
import com.gbsoft.nilo.rest.mapper.MapperBase;
import com.gbsoft.nilo.rest.mapper.MapperException;

public abstract class UserMapper<IO extends UserDto<?>, U extends User> extends MapperBase<IO, U> {
    @Override
    public U entity(IO dto) throws MapperException {
        return null;
    }

    @Override
    public IO dto(U entity) throws MapperException {
        return null;
    }
}
