package ru;

import javax.annotation.Resource;
import javax.ejb.*;
import javax.persistence.criteria.Order;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 * Created by vlad on 23.04.17.
 */
//@Stateless
//public class ItemEJB {
//    public Item convertPrice(Item item) {
//        item.setPrice(item.getPrice() * 0.80F);
//        //item.setCurrency("Euros");
//        return item;
//    }
//}