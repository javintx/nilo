package com.gbsoft.nilo.repository.playschool;

import com.gbsoft.nilo.repository.application.user.UserRepository;
import com.gbsoft.nilo.repository.entity.Identifiable;
import com.gbsoft.nilo.repository.playschool.entity.Teacher;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends UserRepository<Teacher, Identifiable<String>> {
}
