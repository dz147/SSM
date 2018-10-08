package com.gdnf.ssm.web;

import com.gdnf.ssm.dao.BookDAO;
import com.gdnf.ssm.entity.Book;
import com.gdnf.ssm.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.xml.ws.RequestWrapper;

@Controller
public class BookController {
    @Autowired
    private BookService bookService;

    @Autowired
    private BookDAO bookDAO;

    @RequestMapping("/book")
    public ModelAndView getBook(int id) {
        ModelAndView mv = new ModelAndView("book_detail");
        Book book = bookService.getBookById(id);
        mv.addObject("book", book);
        return mv;
    }


}
