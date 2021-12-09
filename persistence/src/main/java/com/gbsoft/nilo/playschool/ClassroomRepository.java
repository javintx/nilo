package com.gbsoft.nilo.playschool;

import com.gbsoft.nilo.RepositoryBase;
import com.gbsoft.nilo.domain.entity.Identifiable;
import com.gbsoft.nilo.domain.playschool.Classroom;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassroomRepository extends RepositoryBase<Classroom, Identifiable<String>> {
}
