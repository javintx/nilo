package com.gbsoft.nilo.rest.application.alert;

import com.gbsoft.nilo.repository.application.alert.entity.Alert;
import com.gbsoft.nilo.repository.entity.Identifiable;
import com.gbsoft.nilo.rest.ControllerBase;
import com.gbsoft.nilo.rest.application.alert.dto.AlertDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/alert")
public class AlertController extends ControllerBase<AlertDto, Alert, Identifiable<String>> {
}
