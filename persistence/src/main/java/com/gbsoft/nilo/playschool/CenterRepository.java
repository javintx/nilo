package com.gbsoft.nilo.playschool;

import com.gbsoft.nilo.RepositoryBase;
import com.gbsoft.nilo.domain.entity.Identifiable;
import com.gbsoft.nilo.domain.playschool.Center;
import org.springframework.stereotype.Repository;

@Repository
public interface CenterRepository extends RepositoryBase<Center, Identifiable<String>> {
}
