package com.book.crud.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.book.crud.mapper.BookMapper;
import com.book.crud.entity.Book;
import com.book.crud.service.BookService;
/**
 * @author: lyq
 * @date:  2020/4/9 11:44 下午
 * @version 1.0
 * @modified by
 */
    
@Service
public class BookServiceImpl extends ServiceImpl<BookMapper, Book> implements BookService{

}
