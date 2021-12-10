package com.gbsoft.nilo.playschool.mapper;

import com.gbsoft.nilo.domain.playschool.Center;
import com.gbsoft.nilo.mapper.MapperBase;
import com.gbsoft.nilo.mapper.MapperException;
import com.gbsoft.nilo.playschool.dto.CenterDto;
import org.springframework.stereotype.Component;

@Component
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
