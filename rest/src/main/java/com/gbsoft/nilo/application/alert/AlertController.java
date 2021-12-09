package com.gbsoft.nilo.application.alert;

import com.gbsoft.nilo.ControllerBase;
import com.gbsoft.nilo.application.alert.dto.AlertDto;
import com.gbsoft.nilo.application.alert.entity.Alert;
import com.gbsoft.nilo.repository.entity.Identifiable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/alert")
public class AlertController extends ControllerBase<AlertDto, Alert, Identifiable<String>> {
}
