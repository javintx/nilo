package com.gbsoft.nilo.application.user.mapper;

import com.gbsoft.nilo.application.user.dto.UserDto;
import com.gbsoft.nilo.domain.application.user.User;
import com.gbsoft.nilo.mapper.MapperBase;
import com.gbsoft.nilo.mapper.MapperException;

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
