package com.github.itdaag.memflow.data;

import java.util.ArrayList;
import java.util.List;

public final class Subject {

    private final String name;
    private final List<Note> notes = new ArrayList<>();

    public Subject(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Note> getNotes() {
        return notes;
    }
}
