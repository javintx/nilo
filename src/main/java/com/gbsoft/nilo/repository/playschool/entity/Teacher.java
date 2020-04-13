package com.gbsoft.nilo.repository.playschool.entity;

import com.gbsoft.nilo.repository.application.user.entity.User;
import com.gbsoft.nilo.repository.application.user.entity.UserType;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.Collection;


@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Teacher extends User {
    @ManyToMany
    private Collection<Classroom> classrooms;
    @ManyToMany
    private Collection<Center> centers;

    @Override
    public UserType getType() {
        return UserType.TEACHER;
    }
}
