package com.gbsoft.nilo.application.language;

import com.gbsoft.nilo.ControllerBase;
import com.gbsoft.nilo.application.language.dto.LanguageDto;
import com.gbsoft.nilo.domain.application.language.Language;
import com.gbsoft.nilo.domain.entity.Identifiable;
import com.gbsoft.nilo.mapper.MapperBase;
import com.gbsoft.nilo.service.ServiceBase;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
@RequestMapping("/language")
public class LanguageController extends ControllerBase<LanguageDto, Language, Identifiable<String>> {
    public LanguageController(Logger LOGGER, ServiceBase<Language, Identifiable<String>> service, MapperBase<LanguageDto, Language> mapper) {
        super(LOGGER, service, mapper);
    }
}
