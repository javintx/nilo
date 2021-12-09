package com.gbsoft.nilo.playschool;

import com.gbsoft.nilo.application.user.UserRepository;
import com.gbsoft.nilo.domain.entity.Identifiable;
import com.gbsoft.nilo.domain.playschool.Teacher;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends UserRepository<Teacher, Identifiable<String>> {
}
