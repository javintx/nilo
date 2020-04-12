package com.gbsoft.nilo.repository.audit;

import com.gbsoft.nilo.repository.RepositoryBase;
import com.gbsoft.nilo.repository.audit.entity.Audit;
import com.gbsoft.nilo.repository.entity.Identifiable;
import org.springframework.stereotype.Repository;

@Repository
public interface AuditRepository extends RepositoryBase<Audit, Identifiable<String>> {
}
