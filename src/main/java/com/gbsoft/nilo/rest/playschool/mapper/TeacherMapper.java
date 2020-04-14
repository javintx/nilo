package com.gbsoft.nilo.rest.playschool.mapper;

import com.gbsoft.nilo.repository.playschool.entity.Teacher;
import com.gbsoft.nilo.rest.application.user.mapper.UserMapper;
import com.gbsoft.nilo.rest.mapper.MapperException;
import com.gbsoft.nilo.rest.playschool.dto.TeacherDto;
import org.springframework.stereotype.Component;

@Component
public class TeacherMapper extends UserMapper<TeacherDto, Teacher> {
    @Override
    public Teacher entity(TeacherDto dto) throws MapperException {
        return super.entity(dto);
    }

    @Override
    public TeacherDto dto(Teacher entity) throws MapperException {
        return super.dto(entity);
    }
}
