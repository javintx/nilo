package com.gbsoft.nilo.service.playschool;

import com.gbsoft.nilo.repository.entity.Identifiable;
import com.gbsoft.nilo.repository.playschool.entity.Manager;
import com.gbsoft.nilo.service.application.user.UserService;
import org.springframework.stereotype.Service;

@Service
public class ManagerService extends UserService<Manager, Identifiable<String>> {
}
