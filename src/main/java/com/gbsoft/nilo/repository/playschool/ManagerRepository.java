package com.gbsoft.nilo.repository.playschool;

import com.gbsoft.nilo.repository.application.user.UserRepository;
import com.gbsoft.nilo.repository.entity.Identifiable;
import com.gbsoft.nilo.repository.playschool.entity.Manager;
import org.springframework.stereotype.Repository;

@Repository
public interface ManagerRepository extends UserRepository<Manager, Identifiable<String>> {
}
