package com.gbsoft.nilo.repository.entity;

import javax.persistence.Column;
import java.util.Collection;
import java.util.Objects;
import java.util.StringJoiner;

public class Clazz extends EntityBase<String> {
    @Column
    private String uid;
    @Column
    private String name;
    @Column
    private ClazzCategory category;
    @Column
    private Center center;

    private Collection<Teacher> teachers;

    @Override
    public String getId() {
        return uid;
    }

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

    public ClazzCategory getCategory() {
        return category;
    }

    public void setCategory(ClazzCategory category) {
        this.category = category;
    }

    public Center getCenter() {
        return center;
    }

    public void setCenter(Center center) {
        this.center = center;
    }

    public Collection<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(Collection<Teacher> teachers) {
        this.teachers = teachers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Clazz clazz = (Clazz) o;
        return Objects.equals(uid, clazz.uid) &&
                Objects.equals(name, clazz.name) &&
                Objects.equals(category, clazz.category) &&
                Objects.equals(center, clazz.center);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uid, name, category);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Clazz.class.getSimpleName() + "[", "]")
                .add("uid='" + uid + "'")
                .add("name='" + name + "'")
                .add("category=" + category)
                .toString();
    }
}
