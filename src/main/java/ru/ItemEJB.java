package ru;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by vlad on 29.04.17.
 */
@Stateless
public class ItemEJB {
    @Resource(name = "currencyEntry")
    private String currency;
    @Resource(name = "changeRateEntry")
    private Float changeRate;
    public Item convertPrice(Item item) {
        item.setPrice(item.getPrice() * changeRate);
        item.setCurrency(currency);
        return item;
    }

    public void createBook(Book book){

    }

    public Book findBooks(){
        Book book = new Book();
        return book;
    }
}