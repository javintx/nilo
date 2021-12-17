package com.gbsoft.nilo.service.audit;

import com.gbsoft.nilo.domain.audit.Audit;
import com.gbsoft.nilo.domain.entity.Identifiable;
import com.gbsoft.nilo.domain.events.AuditEvent;
import com.gbsoft.nilo.service.port.out.ReadRepositoryBase;
import com.gbsoft.nilo.service.port.out.WriteRepositoryBase;

import java.util.logging.Logger;

public class AuditService {

    private final Logger LOGGER;
    private final ReadRepositoryBase<Audit, Identifiable<String>> readRepository;
    private final WriteRepositoryBase<Audit, Identifiable<String>> writeRepository;

    public AuditService(ReadRepositoryBase<Audit, Identifiable<String>> readRepository, WriteRepositoryBase<Audit, Identifiable<String>> writeRepository) {
        this.LOGGER = Logger.getLogger(AuditService.class.getName());
        this.readRepository = readRepository;
        this.writeRepository = writeRepository;
    }

    public void audit(final AuditEvent event) {
        LOGGER.entering(this.getClass().getName(), "audit", event);
        writeRepository.save(event.getAudit());
    }


}
