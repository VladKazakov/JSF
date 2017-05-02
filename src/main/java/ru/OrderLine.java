package ru;

import javax.persistence.*;
import javax.persistence.criteria.Order;
import java.util.List;

/**
 * Created by vlad on 16.04.17.
 */
@Entity
public class OrderLine {
    @Id @GeneratedValue
    private Long id;
    private String item;
    private Integer unitPrice;
    private Integer quantity;





    public OrderLine() {
    }

    public OrderLine(String item, Integer unitPrice, Integer quantity, List<Order1> order1s) {
        this.item = item;
        this.unitPrice = unitPrice;
        this.quantity = quantity;

    }

    public OrderLine(String item, Integer unitPrice, Integer quantity) {
        this.item = item;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public Integer getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Integer unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }


}