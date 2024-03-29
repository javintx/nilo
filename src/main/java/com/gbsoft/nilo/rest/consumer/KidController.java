package com.gbsoft.nilo.rest.consumer;

import com.gbsoft.nilo.repository.consumer.entity.Kid;
import com.gbsoft.nilo.repository.entity.Identifiable;
import com.gbsoft.nilo.rest.ControllerBase;
import com.gbsoft.nilo.rest.consumer.dto.KidDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kid")
public class KidController extends ControllerBase<KidDto, Kid, Identifiable<String>> {
}
