package com.itheima;

import com.itheima.service.BookService;
import com.itheima.service.impl.BookServiceImpl;

/**
 * @author Lee-win10
 */
public class App {
    public static void main(String[] args) {
        BookService bookService = new BookServiceImpl();
        bookService.save();
    }
}
