package com.gbsoft.nilo.repository.application.alert;

import com.gbsoft.nilo.repository.RepositoryBase;
import com.gbsoft.nilo.repository.application.alert.entity.Alert;
import com.gbsoft.nilo.repository.entity.Identifiable;
import org.springframework.stereotype.Repository;

@Repository
public interface AlertRepository extends RepositoryBase<Alert, Identifiable<String>> {
}
