package com.gbsoft.nilo.consumer;

import com.gbsoft.nilo.ControllerBase;
import com.gbsoft.nilo.consumer.dto.KidDto;
import com.gbsoft.nilo.domain.consumer.Kid;
import com.gbsoft.nilo.domain.entity.Identifiable;
import com.gbsoft.nilo.mapper.MapperBase;
import com.gbsoft.nilo.service.ServiceBase;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
@RequestMapping("/kid")
public class KidController extends ControllerBase<KidDto, Kid, Identifiable<String>> {
    public KidController(Logger LOGGER, ServiceBase<Kid, Identifiable<String>> service, MapperBase<KidDto, Kid> mapper) {
        super(LOGGER, service, mapper);
    }
}
