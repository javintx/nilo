package com.gbsoft.nilo.service.playschool;

import com.gbsoft.nilo.repository.entity.Identifiable;
import com.gbsoft.nilo.repository.playschool.entity.Teacher;
import com.gbsoft.nilo.service.application.user.UserService;
import org.springframework.stereotype.Service;

@Service
public class TeacherService extends UserService<Teacher, Identifiable<String>> {
}
