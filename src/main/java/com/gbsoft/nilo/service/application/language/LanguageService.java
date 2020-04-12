package com.gbsoft.nilo.service.application.language;

import com.gbsoft.nilo.repository.application.language.entity.Language;
import com.gbsoft.nilo.repository.entity.Identifiable;
import com.gbsoft.nilo.service.ServiceBase;
import org.springframework.stereotype.Service;

@Service
public class LanguageService extends ServiceBase<Language, Identifiable<String>> {
}
