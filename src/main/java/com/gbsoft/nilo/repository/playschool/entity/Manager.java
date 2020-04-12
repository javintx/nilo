package com.gbsoft.nilo.repository.playschool.entity;

import com.gbsoft.nilo.service.audit.events.Audited;
import com.gbsoft.nilo.repository.application.user.entity.User;
import lombok.Data;
import lombok.EqualsAndHashCode;
import com.gbsoft.nilo.repository.application.user.entity.UserType;

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
