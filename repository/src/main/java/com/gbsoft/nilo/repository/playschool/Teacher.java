package com.gbsoft.nilo.repository.playschool;

import com.gbsoft.nilo.repository.application.user.entity.User;
import com.gbsoft.nilo.repository.application.user.entity.UserType;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Collection;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Teacher extends User {
    @Column
    private Collection<Classroom> classrooms;
    @Column
    private Collection<Center> centers;

    @Override
    public UserType getType() {
        return UserType.TEACHER;
    }
}
