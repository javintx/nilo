package com.gbsoft.nilo.application.language.mapper;

import com.gbsoft.nilo.application.language.dto.LanguageDto;
import com.gbsoft.nilo.domain.application.language.Language;
import com.gbsoft.nilo.mapper.MapperBase;
import com.gbsoft.nilo.mapper.MapperException;
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
