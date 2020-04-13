package com.gbsoft.nilo.repository.playschool.entity;

import com.gbsoft.nilo.repository.application.user.entity.User;
import com.gbsoft.nilo.repository.application.user.entity.UserType;
import com.gbsoft.nilo.service.audit.events.Audited;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.Collection;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Manager extends User {
    @Audited
    @Column
    private ManagerCategory category;
    @ManyToMany
    private Collection<Center> centers;

    @Override
    public UserType getType() {
        return UserType.MANAGER;
    }
}
