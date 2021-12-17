package com.gbsoft.nilo.consumer;

import com.gbsoft.nilo.application.user.UserRepository;
import com.gbsoft.nilo.domain.consumer.Tutor;
import com.gbsoft.nilo.domain.entity.Identifiable;
import org.springframework.stereotype.Repository;

@Repository
public interface TutorRepository extends UserRepository<Tutor, Identifiable<String>> {
}
