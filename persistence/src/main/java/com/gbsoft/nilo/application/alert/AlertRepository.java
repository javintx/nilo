package com.gbsoft.nilo.application.alert;

import com.gbsoft.nilo.RepositoryBase;
import com.gbsoft.nilo.domain.application.alert.Alert;
import com.gbsoft.nilo.domain.entity.Identifiable;
import org.springframework.stereotype.Repository;

@Repository
public interface AlertRepository extends RepositoryBase<Alert, Identifiable<String>> {
}
