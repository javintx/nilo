package com.gbsoft.nilo.playschool;

import com.gbsoft.nilo.application.user.UserController;
import com.gbsoft.nilo.domain.entity.Identifiable;
import com.gbsoft.nilo.domain.playschool.Manager;
import com.gbsoft.nilo.mapper.MapperBase;
import com.gbsoft.nilo.playschool.dto.ManagerDto;
import com.gbsoft.nilo.service.ServiceBase;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
@RequestMapping("/manager")
public class ManagerController extends UserController<ManagerDto, Manager, Identifiable<String>> {
    public ManagerController(Logger LOGGER, ServiceBase<Manager, Identifiable<String>> service, MapperBase<ManagerDto, Manager> mapper) {
        super(LOGGER, service, mapper);
    }
}
