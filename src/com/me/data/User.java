package com.me.data;

import java.util.List;

import static java.util.Objects.hash;

public class User {

    int uid;
    String name;
    String password;

    public User(String name, String password) {
        this.uid = getUidByName(name);
        this.name = name;
        this.password = password;
    }

    public User() {
        this(null, null);
    }

    public int getUid() {
        return uid;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    static public int getUidByName(String name) {
        return hash(name.hashCode());
    }
}
