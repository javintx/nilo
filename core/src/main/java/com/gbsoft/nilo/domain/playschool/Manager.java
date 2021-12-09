package com.gbsoft.nilo.domain.playschool;

import com.gbsoft.nilo.domain.application.user.User;
import com.gbsoft.nilo.domain.application.user.UserType;
import com.gbsoft.nilo.events.Audited;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Collection;

@EqualsAndHashCode(callSuper = true)
@Data
public class Manager extends User {
    @Audited
    private ManagerCategory category;
    private Collection<Center> centers;

    @Override
    public UserType getType() {
        return UserType.MANAGER;
    }
}
