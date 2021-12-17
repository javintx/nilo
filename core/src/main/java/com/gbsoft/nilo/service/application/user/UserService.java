package com.gbsoft.nilo.service.application.user;

import com.gbsoft.nilo.domain.application.user.User;
import com.gbsoft.nilo.domain.entity.Identifiable;
import com.gbsoft.nilo.service.ServiceBase;
import com.gbsoft.nilo.service.audit.AuditService;
import com.gbsoft.nilo.service.port.out.ReadRepositoryBase;
import com.gbsoft.nilo.service.port.out.WriteRepositoryBase;

public abstract class UserService<U extends User, I extends Identifiable<?>> extends ServiceBase<U, I> {
    public UserService(String logger, ReadRepositoryBase<U, I> readRepository, WriteRepositoryBase<U, I> writeRepository, AuditService auditService) {
        super(logger, readRepository, writeRepository, auditService);
    }
}
