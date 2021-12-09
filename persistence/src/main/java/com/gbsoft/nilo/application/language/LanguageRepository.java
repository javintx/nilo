package com.gbsoft.nilo.application.language;

import com.gbsoft.nilo.RepositoryBase;
import com.gbsoft.nilo.domain.application.language.Language;
import com.gbsoft.nilo.domain.entity.Identifiable;
import org.springframework.stereotype.Repository;

@Repository
public interface LanguageRepository extends RepositoryBase<Language, Identifiable<String>> {
}
