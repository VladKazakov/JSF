package ru;

import javax.ejb.embeddable.EJBContainer;
import javax.naming.Context;
import javax.naming.NamingException;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by vlad on 29.04.17.
 */
public class Main2 {
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
            ItemEJB itemEJB = (ItemEJB) ctx.lookup("java:global/classes/ItemEJB");
// Обеспечивает постоянство Book в базе данных
            itemEJB.createBook(book);
// Извлекает информацию обо всех соответствующих книгах из базы данных
//            for (Book aBook : itemEJB.findBooks()) {
//                System.out.println(aBook);
//            }
        }
    }
}