package org.scu.db.demo.service.impl;

import org.scu.db.demo.mapper.BookMapper;
import org.scu.db.demo.model.Book;
import org.scu.db.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookMapper bookMapper;

    public List<Book> findAllBooks()
    {
        return bookMapper.queryBook();
    }
    public List<Integer> findAllBorrowedBooksId() {return bookMapper.query_borrowed_bookID();}
    public List<Map> query_call_and_count(){
        return bookMapper.query_call_and_count();
    }
    public Integer countCall123Book(){return bookMapper.query_call_count("Call123");}
    public List<String> findCountNotExceed2Callnumber(){return bookMapper.query_book_less(2);}

}
