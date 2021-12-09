package com.gbsoft.nilo.service.playschool;

import com.gbsoft.nilo.domain.entity.Identifiable;
import com.gbsoft.nilo.domain.playschool.ClassroomCategory;
import com.gbsoft.nilo.service.ServiceBase;
import com.gbsoft.nilo.service.audit.AuditService;
import com.gbsoft.nilo.service.port.out.ReadRepositoryBase;
import com.gbsoft.nilo.service.port.out.WriteRepositoryBase;

public class ClassroomCategoryService extends ServiceBase<ClassroomCategory, Identifiable<String>> {
    protected ClassroomCategoryService(ReadRepositoryBase<ClassroomCategory, Identifiable<String>> readRepository, WriteRepositoryBase<ClassroomCategory, Identifiable<String>> writeRepository, AuditService auditService) {
        super(ClassroomCategoryService.class.getName(), readRepository, writeRepository, auditService);
    }
}
