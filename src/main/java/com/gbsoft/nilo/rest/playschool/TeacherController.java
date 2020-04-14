package com.gbsoft.nilo.rest.playschool;

import com.gbsoft.nilo.repository.entity.Identifiable;
import com.gbsoft.nilo.repository.playschool.entity.Teacher;
import com.gbsoft.nilo.rest.application.user.UserController;
import com.gbsoft.nilo.rest.playschool.dto.TeacherDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teacher")
public class TeacherController extends UserController<TeacherDto, Teacher, Identifiable<String>> {
}
