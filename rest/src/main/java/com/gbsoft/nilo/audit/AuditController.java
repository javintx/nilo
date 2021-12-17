package com.gbsoft.nilo.audit;

import com.gbsoft.nilo.audit.dto.AuditDto;
import com.gbsoft.nilo.domain.audit.Audit;
import com.gbsoft.nilo.mapper.MapperBase;
import com.gbsoft.nilo.service.audit.AuditService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
@RequestMapping("/audit")
public class AuditController {
    private final Logger LOGGER;
    private final AuditService service;
    private final MapperBase<AuditDto, Audit> mapper;

    public AuditController(Logger LOGGER, AuditService service, MapperBase<AuditDto, Audit> mapper) {
        this.LOGGER = LOGGER;
        this.service = service;
        this.mapper = mapper;
    }

}
