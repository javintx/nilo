package com.gbsoft.nilo.repository.playschool;

import com.gbsoft.nilo.repository.RepositoryBase;
import com.gbsoft.nilo.repository.entity.Identifiable;
import com.gbsoft.nilo.repository.playschool.entity.Center;
import org.springframework.stereotype.Repository;

@Repository
public interface CenterRepository extends RepositoryBase<Center, Identifiable<String>> {
}
