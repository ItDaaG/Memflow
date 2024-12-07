package com.github.itdaag.memflow.data;

public final class Note {

    private final String title;
    private final String text;

    public Note(final String title, final String text) {
        this.title = title;
        this.text = text;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }
}
