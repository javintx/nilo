package com.gbsoft.nilo.rest.application.language.mapper;

import com.gbsoft.nilo.repository.application.language.entity.Language;
import com.gbsoft.nilo.rest.application.language.dto.LanguageDto;
import com.gbsoft.nilo.rest.mapper.MapperBase;
import com.gbsoft.nilo.rest.mapper.MapperException;
import org.springframework.stereotype.Component;

@Component
public class LanguageMapper extends MapperBase<LanguageDto, Language> {
    @Override
    public Language entity(LanguageDto dto) throws MapperException {
        return null;
    }

    @Override
    public LanguageDto dto(Language entity) throws MapperException {
        return null;
    }
}
