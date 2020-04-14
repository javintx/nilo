package com.gbsoft.nilo.rest.consumer.mapper;

import com.gbsoft.nilo.repository.consumer.entity.Tutor;
import com.gbsoft.nilo.rest.application.user.mapper.UserMapper;
import com.gbsoft.nilo.rest.consumer.dto.TutorDto;
import com.gbsoft.nilo.rest.mapper.MapperException;
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
