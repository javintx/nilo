package com.gbsoft.nilo.repository.entity.consumer;

import com.gbsoft.nilo.repository.entity.application.User;
import com.gbsoft.nilo.repository.entity.application.UserType;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Collection;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Tutor extends User {
    @Column
    private TutorRelationship relationship;

    private Collection<Kid> kids;

    @Override
    public UserType getType() {
        return UserType.TUTOR;
    }
}
