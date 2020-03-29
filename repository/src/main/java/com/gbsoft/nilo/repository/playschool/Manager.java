package com.gbsoft.nilo.repository.playschool;

import com.gbsoft.nilo.repository.application.user.entity.User;
import com.gbsoft.nilo.repository.application.user.entity.UserType;
import com.gbsoft.nilo.repository.audit.entity.Audited;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Manager extends User {
    @Audited
    @Column
    private ManagerCategory category;

    @Override
    public UserType getType() {
        return UserType.MANAGER;
    }
}
