package com.gbsoft.nilo.rest.playschool.mapper;

import com.gbsoft.nilo.repository.playschool.entity.Center;
import com.gbsoft.nilo.rest.mapper.MapperBase;
import com.gbsoft.nilo.rest.mapper.MapperException;
import com.gbsoft.nilo.rest.playschool.dto.CenterDto;

public class CenterMapper extends MapperBase<CenterDto, Center> {
    @Override
    public Center entity(CenterDto dto) throws MapperException {
        return null;
    }

    @Override
    public CenterDto dto(Center entity) throws MapperException {
        return null;
    }
}
