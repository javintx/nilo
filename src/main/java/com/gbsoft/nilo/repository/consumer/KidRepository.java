package com.gbsoft.nilo.repository.consumer;

import com.gbsoft.nilo.repository.RepositoryBase;
import com.gbsoft.nilo.repository.consumer.entity.Kid;
import com.gbsoft.nilo.repository.entity.Identifiable;
import org.springframework.stereotype.Repository;

@Repository
public interface KidRepository extends RepositoryBase<Kid, Identifiable<String>> {
}
