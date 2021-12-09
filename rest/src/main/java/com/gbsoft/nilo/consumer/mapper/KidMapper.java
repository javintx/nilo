package com.gbsoft.nilo.consumer.mapper;

import com.gbsoft.nilo.consumer.dto.KidDto;
import com.gbsoft.nilo.consumer.entity.Kid;
import com.gbsoft.nilo.mapper.MapperBase;
import com.gbsoft.nilo.mapper.MapperException;
import org.springframework.stereotype.Component;

@Component
public class KidMapper extends MapperBase<KidDto, Kid> {
    @Override
    public Kid entity(KidDto dto) throws MapperException {
        return null;
    }

    @Override
    public KidDto dto(Kid entity) throws MapperException {
        return null;
    }
}
