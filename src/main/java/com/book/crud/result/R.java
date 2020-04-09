package com.book.crud.result;

import com.book.crud.result.code.ResponseCode;

import com.book.crud.result.code.ResponseCodeInterface;
import lombok.Data;

/**
 * 前后端分离数据封装
 *
 * @version 1.0
 * @author: lyq
 * @date: 2020/3/7 0:39
 * @modified by
 */
@Data
public class R<T> {
    private int code;//请求响应code， 0表示请求成功 其它表示失败

    private String msg;//响应客户端的提示

    private T data;//响应客户端内容

    public R(int code, T data) {
        this.code = code;
        this.data = data;
        this.msg = null;
    }

    public R(int code, String msg) {
        this.code = code;
        this.msg = msg;
        this.data = null;
    }

    public R(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public R() {
        this.code = ResponseCode.SUCCESS.getCode();
        this.msg = ResponseCode.SUCCESS.getMsg();
        this.data = null;
    }

    public R(T data) {
        this.data = data;
        this.code = ResponseCode.SUCCESS.getCode();
        this.msg = ResponseCode.SUCCESS.getMsg();
    }

    public R(ResponseCodeInterface responseCodeInterface) {
        this.data = null;
        this.code = responseCodeInterface.getCode();
        this.msg = responseCodeInterface.getMsg();
    }

    public R(ResponseCodeInterface responseCodeInterface, T data) {
        this.data = data;
        this.code = responseCodeInterface.getCode();
        this.msg = responseCodeInterface.getMsg();
    }

    /**
     * 操作成功 data为null
     */
    public static R success() {
        return new R();
    }

    /**
     * 操作成功 data 不为null
     */
    public static <T> R success(T data) {
        return new R(data);
    }

    /**
     * 自定义 返回操作 data 可控
     */
    public static <T> R getResult(int code, String msg, T data) {
        return new R(code, msg, data);
    }

    /**
     * 自定义返回  data为null
     */
    public static R getResult(int code, String msg) {
        return new R(code, msg);
    }

    /**
     * 自定义返回 入参一般是异常code枚举 data为空
     */
    public static R getResult(ResponseCode responseCode) {
        return new R(responseCode);
    }


    /**
     * 自定义返回 入参一般是异常code枚举 data 可控
     */
    public static <T> R getResult(ResponseCode responseCode, T data) {

        return new R(responseCode, data);
    }
}
