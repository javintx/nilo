package com.gbsoft.nilo.playschool.mapper;

import com.gbsoft.nilo.mapper.MapperBase;
import com.gbsoft.nilo.mapper.MapperException;
import com.gbsoft.nilo.playschool.dto.ClassroomCategoryDto;
import com.gbsoft.nilo.playschool.entity.ClassroomCategory;
import org.springframework.stereotype.Component;

@Component
public class ClassroomCategoryMapper extends MapperBase<ClassroomCategoryDto, ClassroomCategory> {
    @Override
    public ClassroomCategory entity(ClassroomCategoryDto dto) throws MapperException {
        return null;
    }

    @Override
    public ClassroomCategoryDto dto(ClassroomCategory entity) throws MapperException {
        return null;
    }
}
