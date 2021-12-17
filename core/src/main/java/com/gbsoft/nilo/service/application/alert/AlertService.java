package com.gbsoft.nilo.service.application.alert;

import com.gbsoft.nilo.domain.application.alert.Alert;
import com.gbsoft.nilo.domain.entity.Identifiable;
import com.gbsoft.nilo.service.ServiceBase;
import com.gbsoft.nilo.service.audit.AuditService;
import com.gbsoft.nilo.service.port.out.ReadRepositoryBase;
import com.gbsoft.nilo.service.port.out.WriteRepositoryBase;

public class AlertService extends ServiceBase<Alert, Identifiable<String>> {
    public AlertService(ReadRepositoryBase<Alert, Identifiable<String>> readRepository, WriteRepositoryBase<Alert, Identifiable<String>> writeRepository, AuditService auditService) {
        super(AlertService.class.getName(), readRepository, writeRepository, auditService);
    }
}
