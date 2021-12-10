package com.gbsoft.nilo.consumer.mapper;

import com.gbsoft.nilo.application.user.mapper.UserMapper;
import com.gbsoft.nilo.consumer.dto.TutorDto;
import com.gbsoft.nilo.domain.consumer.Tutor;
import com.gbsoft.nilo.mapper.MapperException;
import org.springframework.stereotype.Component;

@Component
public class TutorMapper extends UserMapper<TutorDto, Tutor> {
    @Override
    public Tutor entity(TutorDto dto) throws MapperException {
        return super.entity(dto);
    }

    @Override
    public TutorDto dto(Tutor entity) throws MapperException {
        return super.dto(entity);
    }
}
