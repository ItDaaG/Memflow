package com.github.itdaag.memflow.user;

import com.github.itdaag.memflow.data.Subject;

import java.util.List;

public final class User {

    private final String userName;
    private final List<Subject> subjects;

    public User(String userName, List<Subject> subjects) {
        this.userName = userName;
        this.subjects = subjects;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public String getUserName() {
        return userName;
    }
}
