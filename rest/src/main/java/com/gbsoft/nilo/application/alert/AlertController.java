package com.gbsoft.nilo.application.alert;

import com.gbsoft.nilo.ControllerBase;
import com.gbsoft.nilo.application.alert.dto.AlertDto;
import com.gbsoft.nilo.domain.application.alert.Alert;
import com.gbsoft.nilo.domain.entity.Identifiable;
import com.gbsoft.nilo.mapper.MapperBase;
import com.gbsoft.nilo.service.ServiceBase;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
@RequestMapping("/alert")
public class AlertController extends ControllerBase<AlertDto, Alert, Identifiable<String>> {
    public AlertController(Logger LOGGER, ServiceBase<Alert, Identifiable<String>> service, MapperBase<AlertDto, Alert> mapper) {
        super(LOGGER, service, mapper);
    }
}
