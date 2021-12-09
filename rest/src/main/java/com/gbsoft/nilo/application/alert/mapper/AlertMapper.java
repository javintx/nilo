package com.gbsoft.nilo.application.alert.mapper;

import com.gbsoft.nilo.application.alert.dto.AlertDto;
import com.gbsoft.nilo.application.alert.entity.Alert;
import com.gbsoft.nilo.mapper.MapperBase;
import com.gbsoft.nilo.mapper.MapperException;
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
