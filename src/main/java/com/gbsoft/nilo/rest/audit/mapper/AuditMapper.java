package com.gbsoft.nilo.rest.audit.mapper;

import com.gbsoft.nilo.repository.audit.entity.Audit;
import com.gbsoft.nilo.rest.audit.dto.AuditDto;
import com.gbsoft.nilo.rest.mapper.MapperBase;
import com.gbsoft.nilo.rest.mapper.MapperException;
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
