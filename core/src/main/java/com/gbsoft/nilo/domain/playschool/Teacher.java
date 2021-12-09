package com.gbsoft.nilo.domain.playschool;

import com.gbsoft.nilo.domain.application.user.User;
import com.gbsoft.nilo.domain.application.user.UserType;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Collection;


@EqualsAndHashCode(callSuper = true)
@Data
public class Teacher extends User {
    private Collection<Classroom> classrooms;
    private Collection<Center> centers;

    @Override
    public UserType getType() {
        return UserType.TEACHER;
    }
}
