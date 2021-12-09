package com.gbsoft.nilo.domain.consumer;

import com.gbsoft.nilo.domain.application.user.User;
import com.gbsoft.nilo.domain.application.user.UserType;
import com.gbsoft.nilo.events.Audited;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Collection;

@EqualsAndHashCode(callSuper = true)
@Data
public class Tutor extends User {
    @Audited
    private TutorRelationship relationship;
    private Collection<Kid> kids;

    @Override
    public UserType getType() {
        return UserType.TUTOR;
    }
}
