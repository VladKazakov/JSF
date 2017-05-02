package ru;


import java.io.Serializable;

/**
 * Created by vlad on 09.04.17.
 */
public class NewsId implements Serializable {
    private String title;
    private String language;

    public NewsId(String title, String language) {
        this.title = title;
        this.language = language;
    }

    public NewsId() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
