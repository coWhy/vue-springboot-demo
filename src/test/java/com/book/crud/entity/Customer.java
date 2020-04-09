package com.book.crud.entity;

import lombok.Data;

import java.util.Date;

/**
 * @version 1.0
 * @author: lyq
 * @date: 2020/4/9 11:24 下午
 * @modified by
 */
@Data
public class Customer {
    private String id;//id
    private String account;//账号
    private String password;//登录密码
    private Boolean isMember;//是否是会员 true 是;false 不是
    private String createBy;//创建人id
    private Date createAt;//创建时间
    private String updateBy;//更新人id
    private Date updateAt;//更新时间
}
