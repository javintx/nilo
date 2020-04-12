package com.gbsoft.nilo.rest.application.language;

import com.gbsoft.nilo.repository.application.language.entity.Language;
import com.gbsoft.nilo.repository.entity.Identifiable;
import com.gbsoft.nilo.rest.ControllerBase;
import com.gbsoft.nilo.rest.application.language.dto.LanguageDto;
import org.springframework.stereotype.Controller;

@Controller("/language")
public class LanguageController extends ControllerBase<LanguageDto, Language, Identifiable<String>> {
}
