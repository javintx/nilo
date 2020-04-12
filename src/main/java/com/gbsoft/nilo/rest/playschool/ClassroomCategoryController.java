package com.gbsoft.nilo.rest.playschool;

import com.gbsoft.nilo.repository.entity.Identifiable;
import com.gbsoft.nilo.repository.playschool.entity.ClassroomCategory;
import com.gbsoft.nilo.rest.ControllerBase;
import com.gbsoft.nilo.rest.playschool.dto.ClassroomCategoryDto;
import org.springframework.stereotype.Controller;

@Controller("/classroomCategory")
public class ClassroomCategoryController extends ControllerBase<ClassroomCategoryDto, ClassroomCategory, Identifiable<String>> {
}
