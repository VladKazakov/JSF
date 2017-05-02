package ru;

import javax.faces.bean.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by vlad on 02.05.17.
 */
@Named
@RequestScoped
public class BookController {
    @Inject
    private BookEJB bookEJB;
    private Book book = new Book();
    public String doCreateBook() {
        book = bookEJB.createBook(book);
        return "listBooks.xhtml";
    }
// Методы работы со свойствами
}