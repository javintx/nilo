package com.gbsoft.nilo.repository.entity.playschool;

import com.gbsoft.nilo.repository.entity.application.User;
import com.gbsoft.nilo.repository.entity.application.UserType;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Manager extends User {
    @Column
    private ManagerCategory category;

    @Override
    public UserType getType() {
        return UserType.MANAGER;
    }
}
