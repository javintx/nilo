package com.gbsoft.nilo.repository.consumer;

import com.gbsoft.nilo.repository.application.user.UserRepository;
import com.gbsoft.nilo.repository.consumer.entity.Tutor;
import com.gbsoft.nilo.repository.entity.Identifiable;
import org.springframework.stereotype.Repository;

@Repository
public interface TutorRepository extends UserRepository<Tutor, Identifiable<String>> {
}
