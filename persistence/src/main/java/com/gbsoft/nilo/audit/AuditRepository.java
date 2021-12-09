package com.gbsoft.nilo.audit;

import com.gbsoft.nilo.RepositoryBase;
import com.gbsoft.nilo.domain.audit.Audit;
import com.gbsoft.nilo.domain.entity.Identifiable;
import org.springframework.stereotype.Repository;

@Repository
public interface AuditRepository extends RepositoryBase<Audit, Identifiable<String>> {
}
