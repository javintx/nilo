package com.gbsoft.nilo.audit;

import com.gbsoft.nilo.ControllerBase;
import com.gbsoft.nilo.audit.dto.AuditDto;
import com.gbsoft.nilo.domain.audit.Audit;
import com.gbsoft.nilo.domain.entity.Identifiable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/audit")
public class AuditController extends ControllerBase<AuditDto, Audit, Identifiable<String>> {
}
