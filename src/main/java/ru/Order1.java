package ru;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by vlad on 16.04.17.
 */
@Entity
public class Order1 {
    @Id
    @GeneratedValue
    private Long id;
    private String test;
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn
    @OrderColumn(name = "ggg")
    private List<OrderLine> orderLines;


    @Temporal(TemporalType.TIMESTAMP)
    private Date postDate;

    public Order1() {
    }

    public Order1(String test, List<OrderLine> orderLines) {
        this.test = test;
        this.orderLines = orderLines;
    }

    public Order1(String test) {
        this.test = test;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public List<OrderLine> getOrderLines() {
        return orderLines;
    }

    public void setOrderLines(List<OrderLine> orderLines) {
        this.orderLines = orderLines;
    }

    public Date getPostDate() {
        return postDate;
    }

    public void setPostDate(Date postDate) {
        this.postDate = postDate;
    }
}
