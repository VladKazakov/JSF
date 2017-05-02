package ru;

import javax.ejb.embeddable.EJBContainer;
import javax.naming.Context;
import javax.naming.NamingException;
import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import org.eclipse.persistence.config.QueryType;
import org.junit.Assert;

import java.io.File;
import java.util.*;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Created by vlad on 28.03.17.
 */
public class Main {
    public static void main(String[] args) throws NamingException {
// Задает путь к классам контейнера
        Map<String, Object> properties = new HashMap<>();
        properties.put(EJBContainer.MODULES, new File("target/classes"));

// Создает встроенный контейнер и получает JNDI-контекст
        try (EJBContainer ec = EJBContainer.createEJBContainer(properties)) {
            Context ctx = ec.getContext();

            // Создает экземпляр Book
            Book book = new Book();
            book.setTitle("Автостопом по Галактике");
            book.setPrice(12.5F);
            book.setDescription("Научно-фантастическая комедийная книга");
            book.setIsbn("1-84173-742-2");
            book.setNbOfPage(354);
            book.setIllustrations(false);
// Осуществляет поиск EJB-компонента с представлением без интерфейса
         //   ItemEJB itemEJB = (ItemEJB) ctx.lookup("java:global/classes/ItemEJB");
// Обеспечивает постоянство Book в базе данных
           // itemEJB.createBook(book);
// Извлекает информацию обо всех соответствующих книгах из базы данных
            //for (Book aBook : itemEJB.findBooks()) {
              //  System.out.println(aBook);
            //}
        }
    }
}








//        ArrayList<String> set1 = new ArrayList<>();
//        set1.add("123");
//        set1.add("345");
//        set1.add("678");

//        Book book = new Book("Автостопом по Галактике", 2.5F, "1-84023-742-2", "xcdfvgb", 354, true, set1);
//Book book1 = new Book("H2G2");
//        Address address1 = new Address("Улица-1", "Улица-2", "Москва", "Регион", "101000", "Россия");
//        Address address2 = new Address("Улица-2", "Улица-3", "Москва", "Регион", "102000", "Россия");



//        NewsId newsId = new NewsId("1244Richard Wright has died on September 2008", "EN1");
//News news1 = new News(newsId, "qwertyu9i");
//        News news2 = new News("1244Richard Wright has died on Septemhhhber 200", "qwertyu9i", "sfdg");
//Customer customer = new Customer("Имя", "Отчество", "email","phoneNumber", new Date(), new Date());
//        CreditCard creditCard = new CreditCard("2", 3, CreditCardType.MASTER_CARD);
//        Map<Integer, String> map = new HashMap<>();
//        map.put(12, "Киркоров");
//        map.put(13, "Газманов");
//        CD cd = new CD("name", 12.5f, "Описание", map);
//        List<Address> list = new ArrayList<>();
//        list.add(address1);
//        list.add(address2);
//        Customer customer = new Customer("001", "002", "003", "004", list);






//        OrderLine orderLine1 = new OrderLine("test-1 без", 12, 5);
//        OrderLine orderLine2 = new OrderLine("test-2 без", 13, 6);
//        OrderLine orderLine3 = new OrderLine("test-3 без", 14, 7);
//        Order1 order10 = new Order1("TESTTTETST10 без");
//        Order1 order11 = new Order1("TESTTTETST11 без");
//
//
//        //без связи
//        List<OrderLine> orderLines = new ArrayList<>();
//        orderLines.add(orderLine1);
//        orderLines.add(orderLine2);
//        orderLines.add(orderLine3);
//
//
//        //связь с Order1
//        List<Order1> list2 = new ArrayList<>();
//        list2.add(order10);
//        list2.add(order11);
//        OrderLine orderLine10 = new OrderLine("test-4 связь list2", 14, 7, list2);
//
//
//        //связь с OrderLines
//        Order1 order = new Order1("TEXT", orderLines);
