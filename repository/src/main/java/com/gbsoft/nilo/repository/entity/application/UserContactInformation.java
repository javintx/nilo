package com.gbsoft.nilo.repository.entity.application;

import com.gbsoft.nilo.repository.entity.EntityBase;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class UserContactInformation extends EntityBase<String> {
    @Column
    private String mainPhoneNumber;
    @Column
    private String secondaryPhoneNumber;
    @Column
    private String email;
}
