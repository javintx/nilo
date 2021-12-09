package com.gbsoft.nilo.consumer;

import com.gbsoft.nilo.RepositoryBase;
import com.gbsoft.nilo.domain.consumer.Kid;
import com.gbsoft.nilo.domain.entity.Identifiable;
import org.springframework.stereotype.Repository;

@Repository
public interface KidRepository extends RepositoryBase<Kid, Identifiable<String>> {
}
