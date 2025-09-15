package org.lessons.java.best_of_the_year.models;

public class Song {
    // attributi
    private String songTitle;
    private int songId;

    // costruttore vuoto
    public Song() {

    }

    // costruttore
    public Song(String songTitle, int songId) {
        this.songTitle = songTitle;
        this.songId = songId;
    }

    // metodi get
    public String getSongTitle() {
        return songTitle;
    }

    public int getSongId() {
        return songId;
    }

    // metodi set
    public void setSongTitle(String songTitle) {
        this.songTitle = songTitle;
    }

    public void setSongId(int songId) {
        this.songId = songId;
    }

    // override toString
    @Override
    public String toString() {
        return String.format("%s, %s", songTitle, songId);
    }
}