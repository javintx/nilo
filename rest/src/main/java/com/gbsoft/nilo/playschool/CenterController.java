package com.gbsoft.nilo.playschool;

import com.gbsoft.nilo.ControllerBase;
import com.gbsoft.nilo.domain.entity.Identifiable;
import com.gbsoft.nilo.domain.playschool.Center;
import com.gbsoft.nilo.mapper.MapperBase;
import com.gbsoft.nilo.playschool.dto.CenterDto;
import com.gbsoft.nilo.service.ServiceBase;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
@RequestMapping("/center")
public class CenterController extends ControllerBase<CenterDto, Center, Identifiable<String>> {
    public CenterController(Logger LOGGER, ServiceBase<Center, Identifiable<String>> service, MapperBase<CenterDto, Center> mapper) {
        super(LOGGER, service, mapper);
    }
}
