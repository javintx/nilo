package com.gbsoft.nilo.rest.playschool;

import com.gbsoft.nilo.repository.entity.Identifiable;
import com.gbsoft.nilo.repository.playschool.entity.Classroom;
import com.gbsoft.nilo.rest.ControllerBase;
import com.gbsoft.nilo.rest.playschool.dto.ClassroomDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/classroom")
public class ClassroomController extends ControllerBase<ClassroomDto, Classroom, Identifiable<String>> {
}
