package com.gbsoft.nilo.playschool;

import com.gbsoft.nilo.application.user.UserController;
import com.gbsoft.nilo.domain.entity.Identifiable;
import com.gbsoft.nilo.domain.playschool.Teacher;
import com.gbsoft.nilo.mapper.MapperBase;
import com.gbsoft.nilo.playschool.dto.TeacherDto;
import com.gbsoft.nilo.service.ServiceBase;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
@RequestMapping("/teacher")
public class TeacherController extends UserController<TeacherDto, Teacher, Identifiable<String>> {
    public TeacherController(Logger LOGGER, ServiceBase<Teacher, Identifiable<String>> service, MapperBase<TeacherDto, Teacher> mapper) {
        super(LOGGER, service, mapper);
    }
}
