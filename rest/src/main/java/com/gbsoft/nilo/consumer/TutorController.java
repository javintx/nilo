package com.gbsoft.nilo.consumer;

import com.gbsoft.nilo.application.user.UserController;
import com.gbsoft.nilo.consumer.dto.TutorDto;
import com.gbsoft.nilo.consumer.entity.Tutor;
import com.gbsoft.nilo.repository.entity.Identifiable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tutor")
public class TutorController extends UserController<TutorDto, Tutor, Identifiable<String>> {
}
