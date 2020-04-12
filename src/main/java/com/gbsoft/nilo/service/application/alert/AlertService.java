package com.gbsoft.nilo.service.application.alert;

import com.gbsoft.nilo.repository.application.alert.entity.Alert;
import com.gbsoft.nilo.repository.entity.Identifiable;
import com.gbsoft.nilo.service.ServiceBase;
import org.springframework.stereotype.Service;

@Service
public class AlertService extends ServiceBase<Alert, Identifiable<String>> {
}
