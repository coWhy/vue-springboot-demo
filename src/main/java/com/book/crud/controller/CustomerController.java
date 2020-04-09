package com.book.crud.controller;

import com.book.crud.result.R;
import com.book.crud.service.CustomerService;
import com.book.crud.vo.req.LoginReqVo;
import com.book.crud.vo.resp.LoginRespVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @version 1.0
 * @author: lyq
 * @date: 2020/4/9 11:26 下午
 * @modified by
 */
@RestController
@RequestMapping("/api")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @PostMapping("/user/login")
    public R<LoginRespVo> login(@RequestBody @Valid LoginReqVo vo) {
        return R.success(customerService.login(vo));
    }

}
