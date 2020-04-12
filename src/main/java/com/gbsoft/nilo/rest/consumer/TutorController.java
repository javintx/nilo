package com.gbsoft.nilo.rest.consumer;

import com.gbsoft.nilo.repository.consumer.entity.Tutor;
import com.gbsoft.nilo.repository.entity.Identifiable;
import com.gbsoft.nilo.rest.application.user.UserController;
import com.gbsoft.nilo.rest.consumer.dto.TutorDto;
import org.springframework.stereotype.Controller;

@Controller("/tutor")
public class TutorController extends UserController<TutorDto, Tutor, Identifiable<String>> {
}
