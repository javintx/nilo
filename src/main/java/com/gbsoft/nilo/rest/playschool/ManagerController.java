package com.gbsoft.nilo.rest.playschool;

import com.gbsoft.nilo.repository.entity.Identifiable;
import com.gbsoft.nilo.repository.playschool.entity.Manager;
import com.gbsoft.nilo.rest.application.user.UserController;
import com.gbsoft.nilo.rest.playschool.dto.ManagerDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/manager")
public class ManagerController extends UserController<ManagerDto, Manager, Identifiable<String>> {
}
