package com.gbsoft.nilo.playschool.mapper;

import com.gbsoft.nilo.mapper.MapperBase;
import com.gbsoft.nilo.mapper.MapperException;
import com.gbsoft.nilo.playschool.dto.ClassroomDto;
import com.gbsoft.nilo.playschool.entity.Classroom;
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
