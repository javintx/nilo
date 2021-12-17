package com.gbsoft.nilo.playschool;

import com.gbsoft.nilo.ControllerBase;
import com.gbsoft.nilo.domain.entity.Identifiable;
import com.gbsoft.nilo.domain.playschool.Classroom;
import com.gbsoft.nilo.mapper.MapperBase;
import com.gbsoft.nilo.playschool.dto.ClassroomDto;
import com.gbsoft.nilo.service.ServiceBase;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
@RequestMapping("/classroom")
public class ClassroomController extends ControllerBase<ClassroomDto, Classroom, Identifiable<String>> {
    public ClassroomController(Logger LOGGER, ServiceBase<Classroom, Identifiable<String>> service, MapperBase<ClassroomDto, Classroom> mapper) {
        super(LOGGER, service, mapper);
    }
}
