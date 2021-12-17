package com.gbsoft.nilo.service.consumer;

import com.gbsoft.nilo.domain.consumer.Kid;
import com.gbsoft.nilo.domain.entity.Identifiable;
import com.gbsoft.nilo.service.ServiceBase;
import com.gbsoft.nilo.service.audit.AuditService;
import com.gbsoft.nilo.service.port.out.ReadRepositoryBase;
import com.gbsoft.nilo.service.port.out.WriteRepositoryBase;

public class KidService extends ServiceBase<Kid, Identifiable<String>> {
    public KidService(ReadRepositoryBase<Kid, Identifiable<String>> readRepository, WriteRepositoryBase<Kid, Identifiable<String>> writeRepository, AuditService auditService) {
        super(KidService.class.getName(), readRepository, writeRepository, auditService);
    }
}
