package com.book.crud.entity;

import lombok.Data;

import java.util.Date;

/**
 * @version 1.0
 * @author: lyq
 * @date: 2020/4/9 11:21 下午
 * @modified by
 */
@Data
public class Book {
    private String id;//id
    private String bookName;//图书名称
    private Double bookPrice;//图书价格
    private String createBy;//创建人id
    private Date createAt;//创建时间
    private String updateBy;//更新人id
    private Date updateAt;//更新时间
}
