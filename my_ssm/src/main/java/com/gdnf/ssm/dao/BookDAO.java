package com.gdnf.ssm.dao;

import com.gdnf.ssm.entity.Book;
import org.springframework.stereotype.Repository;

@Repository
public interface BookDAO {
    Book getBook(int id);
}
