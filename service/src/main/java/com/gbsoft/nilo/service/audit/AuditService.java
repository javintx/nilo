package com.gbsoft.nilo.service.audit;

import com.gbsoft.nilo.repository.audit.AuditRepository;
import com.gbsoft.nilo.service.audit.valueobject.AuditEvent;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.logging.Logger;

public class AuditService {

    private final Logger LOGGER;
    private final AuditRepository repository;

    @Autowired
    public AuditService(AuditRepository repository, String clazz) {
        this.LOGGER = Logger.getLogger(clazz);
        this.repository = repository;
    }

    public void audit(final AuditEvent event) {
        LOGGER.entering(this.getClass().getName(), "audit", event);
        repository.save(event.getAudit());
    }


}
