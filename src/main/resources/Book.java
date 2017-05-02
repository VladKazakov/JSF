//package ru;
//
//import javax.persistence.*;
//import javax.validation.constraints.Size;
///**
// * Created by vlad on 28.03.17.
// */
//@Entity
//@NamedQueries({
//    @NamedQuery(name = "findAllBooks", query = "SELECT b FROM Book b"),
//    @NamedQuery(name = "findBookH2G2", query = "SELECT b FROM Book b WHERE b.title = 'H2G2'")})
//@Table(name = "t_book")
//public class Book {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    private String title;
//    private String description;
//    @Size(min = 10, max = 2000)
//    private Float price;
//    private String isbn;
//    private Integer nbOfPage;
//    private Boolean illustrations;
//
//
//    public Book(String title, String desc, Float price, String isbn, Integer nbOfPage, Boolean illustrations) {
//        this.title = title;
//        this.description = desc;
//        this.price = price;
//        this.isbn = isbn;
//        this.nbOfPage = nbOfPage;
//        this.illustrations = illustrations;
//    }
//
//    public Book(String title) {
//        this.title = title;
//    }
//
//
//    public Book() {
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    public Float getPrice() {
//        return price;
//    }
//
//    public void setPrice(Float price) {
//        this.price = price;
//    }
//
//    public String getIsbn() {
//        return isbn;
//    }
//
//    public void setIsbn(String isbn) {
//        this.isbn = isbn;
//    }
//
//    public Integer getNbOfPage() {
//        return nbOfPage;
//    }
//
//    public void setNbOfPage(Integer nbOfPage) {
//        this.nbOfPage = nbOfPage;
//    }
//
//    public Boolean getIllustrations() {
//        return illustrations;
//    }
//
//    public void setIllustrations(Boolean illustrations) {
//        this.illustrations = illustrations;
//    }
//}