package com.aaa.bml.springcloud.service;

import com.aaa.bml.springcloud.mapper.BookMapper;
import com.aaa.bml.springcloud.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookMapper bookMapper;

    public List<Book> selectAllBooks() {
        return bookMapper.selectAll();
    }
}
