package com.cazallau.noteapp.model;

/**
 * Created by gemabeltran on 11/1/17.
 */

public class Note {

    private String tittle;
    private String text;
    private long color;

    public Note(String tittle) {
        this.tittle = tittle;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public long getColor() {
        return color;
    }

    public void setColor(long color) {
        this.color = color;
    }
}
