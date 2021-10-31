package org.scu.db.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.scu.db.demo.model.Book;

import java.util.List;
import java.util.Map;

@Mapper
public interface BookMapper {
    List<Book> queryBook();
    List<Map> query_call_and_count();
    List<Integer> query_borrowed_bookID();
    Integer query_call_count(String callNumber);
    List<String> query_book_less(Integer num);
}
