package com.gbsoft.nilo.rest.application.alert.mapper;

import com.gbsoft.nilo.repository.application.alert.entity.Alert;
import com.gbsoft.nilo.rest.application.alert.dto.AlertDto;
import com.gbsoft.nilo.rest.mapper.MapperBase;
import com.gbsoft.nilo.rest.mapper.MapperException;
import org.springframework.stereotype.Component;

@Component
public class AlertMapper extends MapperBase<AlertDto, Alert> {
    @Override
    public Alert entity(AlertDto dto) throws MapperException {
        return null;
    }

    @Override
    public AlertDto dto(Alert entity) throws MapperException {
        return null;
    }
}
