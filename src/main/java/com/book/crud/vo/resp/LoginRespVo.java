package com.book.crud.vo.resp;

/**
 * 响应前端登录成功后的数据
 *
 * @version 1.0
 * @author: lyq
 * @date: 2020/4/10 1:00 上午
 * @modified by
 */
public class LoginRespVo {
    private String accessToken;
    private String id;
    private String account;

    public String getAccessToken() {
        return accessToken;
    }

    public LoginRespVo setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }

    public String getId() {
        return id;
    }

    public LoginRespVo setId(String id) {
        this.id = id;
        return this;
    }

    public String getAccount() {
        return account;
    }

    public LoginRespVo setAccount(String account) {
        this.account = account;
        return this;
    }
}
