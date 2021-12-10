package com.gbsoft.nilo.playschool;

import com.gbsoft.nilo.ControllerBase;
import com.gbsoft.nilo.domain.entity.Identifiable;
import com.gbsoft.nilo.domain.playschool.Classroom;
import com.gbsoft.nilo.playschool.dto.ClassroomDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/classroom")
public class ClassroomController extends ControllerBase<ClassroomDto, Classroom, Identifiable<String>> {
}
