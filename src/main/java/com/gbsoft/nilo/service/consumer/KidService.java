package com.gbsoft.nilo.service.consumer;

import com.gbsoft.nilo.repository.consumer.entity.Kid;
import com.gbsoft.nilo.repository.entity.Identifiable;
import com.gbsoft.nilo.service.ServiceBase;
import org.springframework.stereotype.Service;

@Service
public class KidService extends ServiceBase<Kid, Identifiable<String>> {
}
