package com.gbsoft.nilo.service.audit;

import com.gbsoft.nilo.domain.audit.Audit;
import com.gbsoft.nilo.domain.entity.Identifiable;
import com.gbsoft.nilo.domain.events.AuditEvent;
import com.gbsoft.nilo.service.ServiceBase;
import com.gbsoft.nilo.service.port.out.ReadRepositoryBase;
import com.gbsoft.nilo.service.port.out.WriteRepositoryBase;

public class AuditService extends ServiceBase<Audit, Identifiable<String>> {

    protected AuditService(ReadRepositoryBase<Audit, Identifiable<String>> readRepository, WriteRepositoryBase<Audit, Identifiable<String>> writeRepository, AuditService auditService) {
        super(AuditService.class.getName(), readRepository, writeRepository, auditService);
    }

    public void audit(final AuditEvent event) {
        getLogger().entering(this.getClass().getName(), "audit", event);
        getWriteRepository().save(event.getAudit());
    }


}
