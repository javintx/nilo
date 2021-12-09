package com.gbsoft.nilo.playschool;

import com.gbsoft.nilo.application.user.UserController;
import com.gbsoft.nilo.playschool.dto.TeacherDto;
import com.gbsoft.nilo.playschool.entity.Teacher;
import com.gbsoft.nilo.repository.entity.Identifiable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teacher")
public class TeacherController extends UserController<TeacherDto, Teacher, Identifiable<String>> {
}
