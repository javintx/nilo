package com.gbsoft.nilo.repository.playschool;

import com.gbsoft.nilo.repository.RepositoryBase;
import com.gbsoft.nilo.repository.entity.Identifiable;
import com.gbsoft.nilo.repository.playschool.entity.Classroom;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassroomRepository extends RepositoryBase<Classroom, Identifiable<String>> {
}
