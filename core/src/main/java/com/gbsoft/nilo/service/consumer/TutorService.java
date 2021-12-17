package com.gbsoft.nilo.service.consumer;

import com.gbsoft.nilo.domain.consumer.Tutor;
import com.gbsoft.nilo.domain.entity.Identifiable;
import com.gbsoft.nilo.service.application.user.UserService;
import com.gbsoft.nilo.service.audit.AuditService;
import com.gbsoft.nilo.service.port.out.ReadRepositoryBase;
import com.gbsoft.nilo.service.port.out.WriteRepositoryBase;

public class TutorService extends UserService<Tutor, Identifiable<String>> {
    public TutorService(ReadRepositoryBase<Tutor, Identifiable<String>> readRepository, WriteRepositoryBase<Tutor, Identifiable<String>> writeRepository, AuditService auditService) {
        super(TutorService.class.getName(), readRepository, writeRepository, auditService);
    }
}
