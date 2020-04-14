package com.gbsoft.nilo.rest.consumer;

import com.gbsoft.nilo.repository.consumer.entity.Tutor;
import com.gbsoft.nilo.repository.entity.Identifiable;
import com.gbsoft.nilo.rest.application.user.UserController;
import com.gbsoft.nilo.rest.consumer.dto.TutorDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tutor")
public class TutorController extends UserController<TutorDto, Tutor, Identifiable<String>> {
}
