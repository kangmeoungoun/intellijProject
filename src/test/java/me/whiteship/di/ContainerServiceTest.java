package me.whiteship.di;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jojoldu@gmail.com on 2020-11-01
 * Blog : http://sdjojoldu.tistory.com
 * Github : http://github.com/jojoldu
 */
public class ContainerServiceTest {
    @Test
    public void getObject_BookRepository(){
        BookRepository object = ContainerService.getObject(BookRepository.class);
        Assert.assertNotNull(object);
    }

    @Test
    public void getObject_BookSerivce(){
        BookService bookService = ContainerService.getObject(BookService.class);
        Assert.assertNotNull(bookService);
        Assert.assertNotNull(bookService.bookRepository);
    }
}