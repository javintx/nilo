package com.gbsoft.nilo.service.playschool;

import com.gbsoft.nilo.domain.entity.Identifiable;
import com.gbsoft.nilo.domain.playschool.Classroom;
import com.gbsoft.nilo.service.ServiceBase;
import com.gbsoft.nilo.service.audit.AuditService;
import com.gbsoft.nilo.service.port.out.ReadRepositoryBase;
import com.gbsoft.nilo.service.port.out.WriteRepositoryBase;

public class ClassroomService extends ServiceBase<Classroom, Identifiable<String>> {
    public ClassroomService(ReadRepositoryBase<Classroom, Identifiable<String>> readRepository, WriteRepositoryBase<Classroom, Identifiable<String>> writeRepository, AuditService auditService) {
        super(ClassroomService.class.getName(), readRepository, writeRepository, auditService);
    }
}
