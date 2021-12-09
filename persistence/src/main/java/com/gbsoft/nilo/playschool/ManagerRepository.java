package com.gbsoft.nilo.playschool;

import com.gbsoft.nilo.application.user.UserRepository;
import com.gbsoft.nilo.domain.entity.Identifiable;
import com.gbsoft.nilo.domain.playschool.Manager;
import org.springframework.stereotype.Repository;

@Repository
public interface ManagerRepository extends UserRepository<Manager, Identifiable<String>> {
}
