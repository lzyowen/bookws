package com.dummy.bookws;

import org.springframework.stereotype.Component;
import org.springframework.util.Assert;
import https.www_bookws_com.xml.book.Book;
import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: Owen Liu
 * @Date: 2019-10-22
 * @Description: bookws
 */
@Component
public class BookRepository {
    private static final Map<Integer, Book> books = new HashMap<>();

    @PostConstruct
    public void initData() {

        Book javaBook = new Book();
        javaBook.setId(1);
        javaBook.setTitle("Head first java");
        javaBook.setPages(400);
        books.put(javaBook.getId(), javaBook);

        Book springBook = new Book();
        springBook.setId(2);
        springBook.setTitle("Spring in action");
        springBook.setPages(400);
        books.put(springBook.getId(), springBook);

        Book pythonBook = new Book();
        pythonBook.setId(3);
        pythonBook.setTitle("Learning Python");
        pythonBook.setPages(400);
        books.put(pythonBook.getId(), pythonBook);

        Book hiberanteBook = new Book();
        hiberanteBook.setId(4);
        hiberanteBook.setTitle("Hibernate in action");
        hiberanteBook.setPages(400);
        books.put(hiberanteBook.getId(), hiberanteBook);
    }

    public Book findBookById(int id) {
        Assert.notNull(id, "The book's name must not be null");
        return books.get(id);
    }
}
