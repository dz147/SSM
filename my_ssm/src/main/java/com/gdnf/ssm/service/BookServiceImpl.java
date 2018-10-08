package com.gdnf.ssm.service;

import com.gdnf.ssm.dao.BookDAO;
import com.gdnf.ssm.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    BookDAO bookDAO =null;
    @Override
    public Book getBookById(int id) {
        System.out.println("开始查询...");
        return bookDAO.getBook(id);
    }
}
