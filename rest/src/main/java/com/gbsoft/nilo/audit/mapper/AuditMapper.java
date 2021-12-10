package com.gbsoft.nilo.audit.mapper;

import com.gbsoft.nilo.audit.dto.AuditDto;
import com.gbsoft.nilo.domain.audit.Audit;
import com.gbsoft.nilo.mapper.MapperBase;
import com.gbsoft.nilo.mapper.MapperException;
import org.springframework.stereotype.Component;

@Component
public class AuditMapper extends MapperBase<AuditDto, Audit> {
    @Override
    public Audit entity(AuditDto dto) throws MapperException {
        return null;
    }

    @Override
    public AuditDto dto(Audit entity) throws MapperException {
        return null;
    }
}
