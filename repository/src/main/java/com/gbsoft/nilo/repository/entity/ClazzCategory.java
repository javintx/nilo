package com.gbsoft.nilo.repository.entity;

import javax.persistence.Column;
import java.util.Objects;
import java.util.StringJoiner;

public class ClazzCategory extends EntityBase<String> {
    @Column
    private String uid;
    @Column
    private String name;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getId() {
        return uid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClazzCategory that = (ClazzCategory) o;
        return Objects.equals(uid, that.uid) &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uid, name);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", ClazzCategory.class.getSimpleName() + "[", "]")
                .add("uid='" + uid + "'")
                .add("name='" + name + "'")
                .toString();
    }
}
