package com.gbsoft.nilo.playschool.mapper;

import com.gbsoft.nilo.application.user.mapper.UserMapper;
import com.gbsoft.nilo.mapper.MapperException;
import com.gbsoft.nilo.playschool.dto.TeacherDto;
import com.gbsoft.nilo.playschool.entity.Teacher;
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
