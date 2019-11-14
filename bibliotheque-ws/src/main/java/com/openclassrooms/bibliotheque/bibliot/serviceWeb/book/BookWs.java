package com.openclassrooms.bibliotheque.bibliot.serviceWeb.book;

import org.openclassroom.bibliot.bibliot.service.BookService;
import org.occ.model.beans.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import javax.annotation.PostConstruct;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

@Service
@WebService(serviceName = "bookWeb", name = "bookWs")
@SOAPBinding(style = Style.DOCUMENT, use = Use.LITERAL)
public class BookWs {

    @Autowired
    BookService bookService;

    public BookWs() {
    }

    @WebMethod
    public Book getBookById(Integer bookId) {
        return this.bookService.getBookById(bookId);

    }

    @WebMethod
    public Book saveNewBook(Book book) {
        return this.bookService.saveNewBook(book);

    }

    @PostConstruct
    public void init() {
        SpringBeanAutowiringSupport.processInjectionBasedOnCurrentContext(this);

    }

}