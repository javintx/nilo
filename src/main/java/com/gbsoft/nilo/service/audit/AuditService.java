package com.gbsoft.nilo.service.audit;

import com.gbsoft.nilo.repository.audit.entity.Audit;
import com.gbsoft.nilo.repository.entity.Identifiable;
import com.gbsoft.nilo.service.audit.events.AuditEvent;
import com.gbsoft.nilo.service.ServiceBase;
import org.springframework.stereotype.Service;

@Service
public class AuditService extends ServiceBase<Audit, Identifiable<String>> {

    public void audit(final AuditEvent event) {
        getLogger().entering(this.getClass().getName(), "audit", event);
        getRepository().save(event.getAudit());
    }


}
