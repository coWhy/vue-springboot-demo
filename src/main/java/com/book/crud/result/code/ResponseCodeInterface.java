package com.book.crud.result.code;

/**
 * code工具类
 *
 * @version 1.0
 * @author: lyq
 * @date: 2020/3/13 23:25
 * @modified by
 */
public interface ResponseCodeInterface {
    int getCode();////获取响应code

    String getMsg();//获取响应客户端的提示
}
