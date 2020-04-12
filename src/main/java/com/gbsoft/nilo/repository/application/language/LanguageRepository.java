package com.gbsoft.nilo.repository.application.language;

import com.gbsoft.nilo.repository.RepositoryBase;
import com.gbsoft.nilo.repository.application.language.entity.Language;
import com.gbsoft.nilo.repository.entity.Identifiable;
import org.springframework.stereotype.Repository;

@Repository
public interface LanguageRepository extends RepositoryBase<Language, Identifiable<String>> {
}
