package com.gbsoft.nilo.rest.playschool.mapper;

import com.gbsoft.nilo.repository.playschool.entity.Classroom;
import com.gbsoft.nilo.rest.mapper.MapperBase;
import com.gbsoft.nilo.rest.mapper.MapperException;
import com.gbsoft.nilo.rest.playschool.dto.ClassroomDto;
import org.springframework.stereotype.Component;

@Component
public class ClassroomMapper extends MapperBase<ClassroomDto, Classroom> {
    @Override
    public Classroom entity(ClassroomDto dto) throws MapperException {
        return null;
    }

    @Override
    public ClassroomDto dto(Classroom entity) throws MapperException {
        return null;
    }
}
