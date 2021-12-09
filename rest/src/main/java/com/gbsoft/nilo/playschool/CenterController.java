package com.gbsoft.nilo.playschool;

import com.gbsoft.nilo.ControllerBase;
import com.gbsoft.nilo.playschool.dto.CenterDto;
import com.gbsoft.nilo.playschool.entity.Center;
import com.gbsoft.nilo.repository.entity.Identifiable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/center")
public class CenterController extends ControllerBase<CenterDto, Center, Identifiable<String>> {
}
