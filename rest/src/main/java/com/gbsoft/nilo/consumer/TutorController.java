package com.gbsoft.nilo.consumer;

import com.gbsoft.nilo.application.user.UserController;
import com.gbsoft.nilo.consumer.dto.TutorDto;
import com.gbsoft.nilo.domain.consumer.Tutor;
import com.gbsoft.nilo.domain.entity.Identifiable;
import com.gbsoft.nilo.mapper.MapperBase;
import com.gbsoft.nilo.service.ServiceBase;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
@RequestMapping("/tutor")
public class TutorController extends UserController<TutorDto, Tutor, Identifiable<String>> {
    public TutorController(Logger LOGGER, ServiceBase<Tutor, Identifiable<String>> service, MapperBase<TutorDto, Tutor> mapper) {
        super(LOGGER, service, mapper);
    }
}
