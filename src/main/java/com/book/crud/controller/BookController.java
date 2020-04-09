package com.book.crud.controller;

import com.book.crud.entity.Book;
import com.book.crud.result.R;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @version 1.0
 * @author: lyq
 * @date: 2020/4/9 7:36 下午
 * @modified by
 */
@RestController
@RequestMapping("/api")
public class BookController {
    @GetMapping("/books")
    public R<List<Book>> getAllBooks(){
        return null;
    }
}
