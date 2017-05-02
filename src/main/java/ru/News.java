package ru;

import javax.persistence.*;

/**
 * Created by vlad on 09.04.17.
 */
@Entity
@IdClass(NewsId.class)
public class News {

    @Id private String title;
    @Id private String language;
    private String description;

    public News() {
    }



    public News(String title, String language) {
        this.title = title;
        this.language = language;
    }

    public News(String title, String language, String description) {
        this.title = title;
        this.language = language;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
