package com.gbsoft.nilo.playschool;

import com.gbsoft.nilo.ControllerBase;
import com.gbsoft.nilo.domain.entity.Identifiable;
import com.gbsoft.nilo.domain.playschool.ClassroomCategory;
import com.gbsoft.nilo.playschool.dto.ClassroomCategoryDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/classroomCategory")
public class ClassroomCategoryController extends ControllerBase<ClassroomCategoryDto, ClassroomCategory, Identifiable<String>> {
}
