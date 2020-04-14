package com.gbsoft.nilo.rest.audit;

import com.gbsoft.nilo.repository.audit.entity.Audit;
import com.gbsoft.nilo.repository.entity.Identifiable;
import com.gbsoft.nilo.rest.ControllerBase;
import com.gbsoft.nilo.rest.audit.dto.AuditDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/audit")
public class AuditController extends ControllerBase<AuditDto, Audit, Identifiable<String>> {
}
