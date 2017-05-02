package ru;

import javax.persistence.*;

/**
 * Created by vlad on 19.04.17.
 */
@Entity
public class ItemBook extends Item {
    @Id
    @GeneratedValue
    private Long id;
    private String isbn;
    private String publisher;
    private Integer nbOfPage;
    private Boolean illustrations;

    public ItemBook() {
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Integer getNbOfPage() {
        return nbOfPage;
    }

    public void setNbOfPage(Integer nbOfPage) {
        this.nbOfPage = nbOfPage;
    }

    public Boolean getIllustrations() {
        return illustrations;
    }

    public void setIllustrations(Boolean illustrations) {
        this.illustrations = illustrations;
    }
}
