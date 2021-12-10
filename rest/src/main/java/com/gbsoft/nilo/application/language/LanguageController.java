package com.gbsoft.nilo.application.language;

import com.gbsoft.nilo.ControllerBase;
import com.gbsoft.nilo.application.language.dto.LanguageDto;
import com.gbsoft.nilo.domain.application.language.Language;
import com.gbsoft.nilo.domain.entity.Identifiable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/language")
public class LanguageController extends ControllerBase<LanguageDto, Language, Identifiable<String>> {
}
