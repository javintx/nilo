package com.gbsoft.nilo.service.consumer;

import com.gbsoft.nilo.repository.consumer.entity.Tutor;
import com.gbsoft.nilo.repository.entity.Identifiable;
import com.gbsoft.nilo.service.application.user.UserService;
import org.springframework.stereotype.Service;

@Service
public class TutorService extends UserService<Tutor, Identifiable<String>> {
}
