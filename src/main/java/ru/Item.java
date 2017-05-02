package ru;

import javax.persistence.*;

/**
 * Created by vlad on 19.04.17.
 */
@MappedSuperclass
@Inheritance(strategy = InheritanceType.JOINED)
public class Item {

    //protected Long id;
    protected String title;
    protected Float price;
    protected String description;
    protected String currency;







    public Item() {
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
