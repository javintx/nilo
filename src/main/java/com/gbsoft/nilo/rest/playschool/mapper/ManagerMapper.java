package com.gbsoft.nilo.rest.playschool.mapper;

import com.gbsoft.nilo.repository.playschool.entity.Manager;
import com.gbsoft.nilo.rest.application.user.mapper.UserMapper;
import com.gbsoft.nilo.rest.mapper.MapperException;
import com.gbsoft.nilo.rest.playschool.dto.ManagerDto;
import org.springframework.stereotype.Component;

@Component
public class ManagerMapper extends UserMapper<ManagerDto, Manager> {
    @Override
    public Manager entity(ManagerDto dto) throws MapperException {
        return super.entity(dto);
    }

    @Override
    public ManagerDto dto(Manager entity) throws MapperException {
        return super.dto(entity);
    }
}
