package ru;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by vlad on 09.04.17.
 */
@Entity
@NamedQueries({
        @NamedQuery(name = Book.FIND_ALL, query = "SELECT b FROM Book b")
})
public class Book {
    public static final String FIND_ALL = "Book.FIND_ALL";
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String description;
    private Float price;
    private String isbn;
    private Integer nbOfPage;
    private Boolean illustrations;

    public Book(String title, String description, Float price, String isbn, Integer nbOfPage, Boolean illustrations) {
        this.title = title;
        this.description = description;
        this.price = price;
        this.isbn = isbn;
        this.nbOfPage = nbOfPage;
        this.illustrations = illustrations;
    }

    public Book() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
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
