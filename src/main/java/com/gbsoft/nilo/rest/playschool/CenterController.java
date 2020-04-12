package com.gbsoft.nilo.rest.playschool;

import com.gbsoft.nilo.repository.entity.Identifiable;
import com.gbsoft.nilo.repository.playschool.entity.Center;
import com.gbsoft.nilo.rest.ControllerBase;
import com.gbsoft.nilo.rest.playschool.dto.CenterDto;
import org.springframework.stereotype.Controller;

@Controller("/center")
public class CenterController extends ControllerBase<CenterDto, Center, Identifiable<String>> {
}
