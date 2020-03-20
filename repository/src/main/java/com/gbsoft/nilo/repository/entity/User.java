package com.gbsoft.nilo.repository.entity;

import javax.persistence.Column;
import java.util.Calendar;
import java.util.Objects;
import java.util.StringJoiner;

public abstract class User extends EntityBase<String> {
    @Column
    private String uid;
    @Column
    private String user;
    @Column
    private String password;
    @Column
    private Calendar creation;
    @Column
    private Calendar deletion;

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

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Calendar getCreation() {
        return creation;
    }

    public void setCreation(Calendar creation) {
        this.creation = creation;
    }

    public Calendar getDeletion() {
        return deletion;
    }

    public void setDeletion(Calendar deletion) {
        this.deletion = deletion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user1 = (User) o;
        return Objects.equals(uid, user1.uid) &&
                Objects.equals(user, user1.user) &&
                Objects.equals(password, user1.password) &&
                Objects.equals(creation, user1.creation) &&
                Objects.equals(deletion, user1.deletion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uid, user, password, creation, deletion);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", User.class.getSimpleName() + "[", "]")
                .add("uid='" + uid + "'")
                .add("user='" + user + "'")
                .add("password='" + password + "'")
                .add("creation=" + creation)
                .add("deletion=" + deletion)
                .toString();
    }
}
