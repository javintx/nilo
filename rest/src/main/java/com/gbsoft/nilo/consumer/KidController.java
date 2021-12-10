package com.gbsoft.nilo.consumer;

import com.gbsoft.nilo.ControllerBase;
import com.gbsoft.nilo.consumer.dto.KidDto;
import com.gbsoft.nilo.domain.consumer.Kid;
import com.gbsoft.nilo.domain.entity.Identifiable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kid")
public class KidController extends ControllerBase<KidDto, Kid, Identifiable<String>> {
}
