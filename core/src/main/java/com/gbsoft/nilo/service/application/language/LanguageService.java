package com.gbsoft.nilo.service.application.language;

import com.gbsoft.nilo.domain.application.language.Language;
import com.gbsoft.nilo.domain.entity.Identifiable;
import com.gbsoft.nilo.service.ServiceBase;
import com.gbsoft.nilo.service.audit.AuditService;
import com.gbsoft.nilo.service.port.out.ReadRepositoryBase;
import com.gbsoft.nilo.service.port.out.WriteRepositoryBase;

public class LanguageService extends ServiceBase<Language, Identifiable<String>> {
    LanguageService(ReadRepositoryBase<Language, Identifiable<String>> readRepository, WriteRepositoryBase<Language, Identifiable<String>> writeRepository, AuditService auditService) {
        super(LanguageService.class.getName(), readRepository, writeRepository, auditService);
    }
}
