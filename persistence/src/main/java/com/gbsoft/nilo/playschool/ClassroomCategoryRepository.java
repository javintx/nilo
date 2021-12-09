package com.gbsoft.nilo.playschool;

import com.gbsoft.nilo.RepositoryBase;
import com.gbsoft.nilo.domain.entity.Identifiable;
import com.gbsoft.nilo.domain.playschool.ClassroomCategory;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassroomCategoryRepository extends RepositoryBase<ClassroomCategory, Identifiable<String>> {
}
