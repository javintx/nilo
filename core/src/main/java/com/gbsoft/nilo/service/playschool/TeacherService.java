package com.gbsoft.nilo.service.playschool;

import com.gbsoft.nilo.domain.entity.Identifiable;
import com.gbsoft.nilo.domain.playschool.Teacher;
import com.gbsoft.nilo.service.application.user.UserService;
import com.gbsoft.nilo.service.audit.AuditService;
import com.gbsoft.nilo.service.port.out.ReadRepositoryBase;
import com.gbsoft.nilo.service.port.out.WriteRepositoryBase;

public class TeacherService extends UserService<Teacher, Identifiable<String>> {
    protected TeacherService(ReadRepositoryBase<Teacher, Identifiable<String>> readRepository, WriteRepositoryBase<Teacher, Identifiable<String>> writeRepository, AuditService auditService) {
        super(TeacherService.class.getName(), readRepository, writeRepository, auditService);
    }
}
