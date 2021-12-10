package com.gbsoft.nilo.playschool.mapper;

import com.gbsoft.nilo.application.user.mapper.UserMapper;
import com.gbsoft.nilo.domain.playschool.Manager;
import com.gbsoft.nilo.mapper.MapperException;
import com.gbsoft.nilo.playschool.dto.ManagerDto;
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
