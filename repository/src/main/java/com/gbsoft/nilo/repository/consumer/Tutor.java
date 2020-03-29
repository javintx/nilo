package com.gbsoft.nilo.repository.consumer;

import com.gbsoft.nilo.repository.application.user.entity.User;
import com.gbsoft.nilo.repository.application.user.entity.UserType;
import com.gbsoft.nilo.repository.audit.entity.Audited;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Collection;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Tutor extends User {
    @Audited
    @Column
    private TutorRelationship relationship;

    private Collection<Kid> kids;

    @Override
    public UserType getType() {
        return UserType.TUTOR;
    }
}
