package com.book.crud.service;

import com.book.crud.entity.Customer;
import com.baomidou.mybatisplus.extension.service.IService;
import com.book.crud.vo.req.LoginReqVo;
import com.book.crud.vo.resp.LoginRespVo;

/**
 * @version 1.0
 * @author: lyq
 * @date: 2020/4/9 11:44 下午
 * @modified by
 */

public interface CustomerService extends IService<Customer> {
    /**
     * 根据账号查询用户信息
     * @param account 账号
     * @return 用户信息
     */
    Customer getCustomerInfoByAccount(String account);

    /**
     * 用户登录
     * @param vo 接收登录表单数据
     * @return 响应数据
     */
    LoginRespVo login(LoginReqVo vo);

}
