package com.gbsoft.nilo.service.playschool;

import com.gbsoft.nilo.domain.entity.Identifiable;
import com.gbsoft.nilo.domain.playschool.Center;
import com.gbsoft.nilo.service.ServiceBase;
import com.gbsoft.nilo.service.audit.AuditService;
import com.gbsoft.nilo.service.port.out.ReadRepositoryBase;
import com.gbsoft.nilo.service.port.out.WriteRepositoryBase;

public class CenterService extends ServiceBase<Center, Identifiable<String>> {
    protected CenterService(ReadRepositoryBase<Center, Identifiable<String>> readRepository, WriteRepositoryBase<Center, Identifiable<String>> writeRepository, AuditService auditService) {
        super(CenterService.class.getName(), readRepository, writeRepository, auditService);
    }
}
