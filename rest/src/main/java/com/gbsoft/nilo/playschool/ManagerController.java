package com.gbsoft.nilo.playschool;

import com.gbsoft.nilo.application.user.UserController;
import com.gbsoft.nilo.domain.entity.Identifiable;
import com.gbsoft.nilo.domain.playschool.Manager;
import com.gbsoft.nilo.playschool.dto.ManagerDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/manager")
public class ManagerController extends UserController<ManagerDto, Manager, Identifiable<String>> {
}
