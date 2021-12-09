package com.gbsoft.nilo.service.playschool;

import com.gbsoft.nilo.domain.entity.Identifiable;
import com.gbsoft.nilo.domain.playschool.Manager;
import com.gbsoft.nilo.service.application.user.UserService;
import com.gbsoft.nilo.service.audit.AuditService;
import com.gbsoft.nilo.service.port.out.ReadRepositoryBase;
import com.gbsoft.nilo.service.port.out.WriteRepositoryBase;

public class ManagerService extends UserService<Manager, Identifiable<String>> {
    protected ManagerService(ReadRepositoryBase<Manager, Identifiable<String>> readRepository, WriteRepositoryBase<Manager, Identifiable<String>> writeRepository, AuditService auditService) {
        super(ManagerService.class.getName(), readRepository, writeRepository, auditService);
    }
}
