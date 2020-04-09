package com.book.crud.vo.req;

import lombok.Data;
import lombok.NonNull;

import javax.validation.constraints.NotBlank;

/**
 * 接收前端传入登录表单数据 进行校验
 * @version 1.0
 * @author: lyq
 * @date: 2020/4/10 12:56 上午
 * @modified by
 */
@Data
public class LoginReqVo {
    @NotBlank(message = "账号不能为空")
    private String account;
    @NotBlank(message = "登录密码不能为空")
    private String password;
}
