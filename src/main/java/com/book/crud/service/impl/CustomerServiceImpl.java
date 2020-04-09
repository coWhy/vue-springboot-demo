package com.book.crud.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.book.crud.constants.Constant;
import com.book.crud.exception.BusinessException;
import com.book.crud.result.code.ResponseCode;
import com.book.crud.utils.jwt.JwtTokenUtil;
import com.book.crud.vo.req.LoginReqVo;
import com.book.crud.vo.resp.LoginRespVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.book.crud.mapper.CustomerMapper;
import com.book.crud.entity.Customer;
import com.book.crud.service.CustomerService;

/**
 * @version 1.0
 * @author: lyq
 * @date: 2020/4/9 11:44 下午
 * @modified by
 */

@Service
public class CustomerServiceImpl extends ServiceImpl<CustomerMapper, Customer> implements CustomerService {
    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public Customer getCustomerInfoByAccount(String account) {
        if (StringUtils.isBlank(account)) {
            return null;
        }
        return customerMapper
                .selectOne(new QueryWrapper<Customer>()
                        .eq("account", account));
    }

    @Override
    public LoginRespVo login(LoginReqVo vo) {
        Customer customerByAccount = getCustomerInfoByAccount(vo.getAccount());
        //1.该账号不存在
        if (null == customerByAccount) {
            throw new BusinessException(ResponseCode.ACCOUNT_ERROR);
        }
        //2.用户不是会员
        if (customerByAccount.getIsMember() == 0) {
            throw new BusinessException(ResponseCode.ACCOUNT_IS_NOT_MEMBER);
        }
        //3.用户密码错误
        if (!customerByAccount.getPassword().equals(vo.getPassword())) {
            throw new BusinessException(ResponseCode.ACCOUNT_PASSWORD_ERROR);
        }
        //响应给前端的vo LoginRespVo 用于存放到token中
        //claims 存储jwt里面的信息 一般存放用户的权限/角色信息 --> 这里我们存放 ---> 是否是会员 和 账号信息
        //subject 一般存放用户id
        Map<String, Object> claims = new HashMap<>();
        claims.put(Constant.JWT_MEMBER_KEY, customerByAccount.getIsMember());
        //存入用户的账号
        claims.put(Constant.JWT_USER_NAME, customerByAccount.getAccount());
        System.err.println("日志：存入" + vo.getAccount() + "的claims： " + claims);
        //生成token
        String accessToken = JwtTokenUtil.getAccessToken(customerByAccount.getId(), claims);
        return new LoginRespVo().setAccessToken(accessToken)
                .setAccount(customerByAccount.getAccount())
                .setId(customerByAccount.getId());
    }

}
